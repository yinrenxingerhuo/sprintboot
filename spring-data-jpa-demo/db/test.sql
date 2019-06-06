--
-- UXsinoDB database dump
--

-- Dumped from database version 10.0
-- Dumped by ux_dump version 10.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, ux_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: student; Type: TABLE; Schema: public; Owner: uxdb
--

CREATE TABLE student (
    sname character varying(255),
    sage integer,
    id integer NOT NULL
);


ALTER TABLE student OWNER TO uxdb;

--
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: uxdb
--

ALTER TABLE ONLY student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);

