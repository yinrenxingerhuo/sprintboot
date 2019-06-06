package com.person.vincent.repository;

import com.person.vincent.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, String> {

    Student findBySname(String sname);

    @Query("select id, sname, sage from Student s where s.sname = :sname")
    Student findStudent(@Param("sname") String sname);
}
