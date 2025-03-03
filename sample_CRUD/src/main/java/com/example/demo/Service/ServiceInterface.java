package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public interface ServiceInterface {
	//Insert
		public Student saveStudent(Student stu) ;
		//update
		public Student updateStudent(Student stu,int  id);
		//delete
		public void deleteStudent(int id) ;
		//finding by id
		public Student findById(int id) ;
		// select query
		public List<Student> findAll();

}
