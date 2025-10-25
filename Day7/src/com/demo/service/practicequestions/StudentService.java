package com.demo.service.practicequestions;

import java.util.List;
import com.demo.beans.practicequestions.Student;

public interface StudentService {
	
	boolean addNewStudent();
    
    void displayAllStudents();
    
    void serializeStudents();
    
    void deserializeAndDisplayStudents();
}
