package com.Students.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepositry se;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		Student student2=se.save(student);
		return student2;
	}
	

}
