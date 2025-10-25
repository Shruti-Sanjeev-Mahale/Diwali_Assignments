package com.demo.dao.practicequestions;

import java.util.List;

import com.demo.beans.practicequestions.Student;

public interface StudentDao {
	
	boolean save(Student s);
	
    List<Student> getAllStudents();
    
    void serializeStudents(List<Student> students);
    
    List<Student> deserializeStudents();
}
