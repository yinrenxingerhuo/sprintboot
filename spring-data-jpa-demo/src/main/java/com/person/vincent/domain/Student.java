package com.person.vincent.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Student {

    @Id
    private Integer id;

    @Column
    private String sname;

    @Column
    private Integer sage;

    public Student() {
    }

    public Student(Integer id,String sname, Integer sage) {
        this.id =  id;
        this.sname = sname;
        this.sage = sage;
    }

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSname() {
        return sname;
    }

    public Student setSname(String sname) {
        this.sname = sname;
        return this;
    }

    public Integer getSage() {
        return sage;
    }

    public Student setSage(Integer sage) {
        this.sage = sage;
        return this;
    }
}
