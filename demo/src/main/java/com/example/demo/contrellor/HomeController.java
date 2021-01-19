package com.example.demo.contrellor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceimplementation.StudentServiceImpl;

@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	@PostMapping(value="savestudent")
	public Student saveStudent(@RequestBody Student student ) {
		System.out.println("save student works");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	@GetMapping(value="getAllStudents")
	public List<Student> findAllStudent(){
		 return studentServiceImpl.FindAllStudent();
	}
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
@DeleteMapping("deleteStudent")
public String deleteStudent(@RequestParam int id) {
	studentServiceImpl.deleteStudent(id);
	return "student deleted";
}
}
