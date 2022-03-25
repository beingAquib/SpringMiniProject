package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.StudentNotFound;
import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentImpl implements IStudent {
	@Autowired
	StudentRepo sr;
	
	@Override
public Integer svStu(Student student) {
	
	//Student student=new Student();
	System.out.println(student);
	student.setBaseAmt(8400);
	student.setGst(1800);
	student.setNum(10000.0);
	//sr.save(student);
	return sr.save(student).getTotalAmt();
}
	
	@Override
	public Page<Student> getAllStu(Pageable pageable) {
		
		
		
		return   sr.findAll(pageable) ;
	}
	
	@Override
	public void delStu(Integer sid) {
		
		Optional<Student> check =sr.findById(sid);
		
		if(check.isPresent())
		{
		sr.delete(check.get());	
		}
		else
			throw new StudentNotFound("Student with this roll number is not available");
		
		//sr.deleteById(sid);
		
	}
	@Override
	public Student getStu(Integer sid) {
		
		
		
		
		return sr.findById(sid).get();
	}
	
}
