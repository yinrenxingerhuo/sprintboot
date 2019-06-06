package com.person.vincent.repository;

import com.person.vincent.domain.Student;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Before
    public void doBefore() {
        studentRepository.deleteAll();
    }

    @Test
    public void test() {
        studentRepository.save(new Student(1,"AAA", 18));
        studentRepository.save(new Student(2,"BBB", 19));
        studentRepository.save(new Student(3,"CCC", 20));
        studentRepository.save(new Student(4,"DDD", 21));
        studentRepository.save(new Student(5,"EEE", 22));

        Assert.assertEquals(5, studentRepository.count());
        Student lists = studentRepository.findBySname("BBB");
        Assert.assertEquals(19, studentRepository.findBySname("BBB").getSage().intValue());
    }

}
