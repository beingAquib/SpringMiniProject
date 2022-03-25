package com.example.demo.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.exceptions.StudentNotFound;
import com.example.demo.model.Student;
import com.example.demo.service.IStudent;

@Controller
public class RegController {
	
	@Autowired
	IStudent ser;
	
	@GetMapping("/")
	public String open()
	{	
		return "StudentRegForm";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Student student,Model m)
	{	
		Integer amt=ser.svStu(student);
		System.out.println("Done");
		m.addAttribute("amt",amt);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String getAllStu(Model m , @PageableDefault(page=0,size=3) Pageable p){
		
		List<Student> ss=ser.getAllStu(p).getContent();
		m.addAttribute("Studs",ss);
		m.addAttribute("page",ser.getAllStu(p));
		
		return "AllStu";
	}
	
	@GetMapping("/delete")
	public String delEmp(@RequestParam Integer id ,Model m ) {
		try {
		ser.delStu(id);
		
		
		return "redirect:all";
		}
		catch(StudentNotFound e) {
			
			//e.getMessage();
			
			throw e;
			
			
		}
	}
	
	@GetMapping("/edit")
	public String editSTu( @RequestParam("id") Integer i,Model m  ) {
		
		m.addAttribute("stu", ser.getStu(i));
		
		
		return "Edit";
	}
	
	@PostMapping("/goedit")
	public String editSTu( @ModelAttribute Student stu ) {
		
		Integer amt=ser.svStu(stu);
		
		
		return "redirect:all";
	}
	
}
