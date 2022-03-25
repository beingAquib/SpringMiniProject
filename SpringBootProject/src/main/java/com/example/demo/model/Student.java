package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="StudentReg")
public class Student {

	@Id
	@GeneratedValue
	Integer rollNumber;
	
	String name;
	
	String email;
	
	String gender;
	
	String Address;
	
	Double num;
	
//	@ElementCollection
//	@ManyToMany 
//	@JoinColumn(name="SturollNmber",unique = true )
//	List<Course> course;
	
	Integer baseAmt;
	
	Integer gst;
	
	Integer totalAmt;
	
	
	
	
}
