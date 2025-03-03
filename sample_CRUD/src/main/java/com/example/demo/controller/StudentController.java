package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService sts;
	

	@GetMapping("/gett")
	public String get() {
		return "Established";
	}
	//Inserting the Values in the Table//Insert
	@PostMapping("/add")
	public Student InsertStudent(@RequestBody Student stu){
		return sts.saveStudent(stu);
	}
	//Showing the values in the table//Select
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return sts.findAll();
	}
	//Deleting the valueby id;
	@DeleteMapping("/deletebyId/{id}")
	public void deletebyid(@PathVariable int id) {
		sts.deleteStudent(id);
	}
	//Update the value
	@PutMapping("/{id}")
	public Student update(@RequestBody Student stu,@PathVariable int id) {
		return sts.updateStudent(stu,id);
	}
}
