package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositary.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentService implements ServiceInterface {
	@Autowired
	private StudentRepository studentRepository;
	
	//Insert
	public Student saveStudent(Student stu) {
		return studentRepository.save(stu);
	}
	
	//update
	public Student updateStudent(Student stu,int  id) {
		Student old=studentRepository.findById(id).orElse(null);
	//	old.setId(stu.getId());
		old.setName(stu.getName());
		old.setMarks(stu.getMarks());
		studentRepository.save(old);
		return old;
	}
	//delete
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	//finding by id
	public Student findById(int id) {
		return studentRepository.findById(id).get();
		
	}
	// select query
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	

}
