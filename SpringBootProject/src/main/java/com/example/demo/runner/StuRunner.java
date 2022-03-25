package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repo.CourseRepo;
import com.example.demo.repo.StudentRepo;

//@Component
public class StuRunner implements CommandLineRunner {
	@Autowired
	StudentRepo sr;
	@Autowired
	CourseRepo cr;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student sc=new Student();
		//sc.setRollNumber(1);
		sc.setGender("malehtfh");
//		//sc.setCourse(Arrays.asList(new Course(1,"sc")));
//		
// 		Course co=new Course(1,"scz");
// 		Course c1=new Course(2,"scx");
// 		Course c2=new Course(3,"scb");
// 		Course c3=new Course(4,"scv");
// 		
// 		cr.saveAll(Arrays.asList(co,c1,c2,c3));
//		
//		sc.setCourse(Arrays.asList(co));
		sr.save(sc);
		//Student sd=new Student(new Integer(8),"maleerttreeeee");
		//sr.delete(sd);
		System.out.println("Done");
		
	}
}
