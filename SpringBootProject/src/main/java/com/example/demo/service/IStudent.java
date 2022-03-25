package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.model.Student;

public interface IStudent {
	
	Integer svStu(Student S);
	Page<Student> getAllStu(Pageable pageable);
	public void delStu(Integer sid);
	public Student getStu(Integer sid); 

}
