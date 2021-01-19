package com.example.demo.serviceinterface;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentInterface {
	//add
public Student saveStudent(Student student);
//update
public Student updateStudent(Student student);
//getall
public List<Student> FindAllStudent();
//supp
public void deleteStudent(int id);
}
 