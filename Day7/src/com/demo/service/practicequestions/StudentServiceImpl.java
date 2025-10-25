package com.demo.service.practicequestions;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.practicequestions.Student;
import com.demo.dao.practicequestions.StudentDao;
import com.demo.dao.practicequestions.StudentDaoImpl;
import com.demo.exceptions.practicequestions.AttendanceShortageException;

public class StudentServiceImpl implements StudentService {
    private StudentDao sdao = new StudentDaoImpl();

    @Override
    public boolean addNewStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Course: ");
        String course = sc.nextLine();

        System.out.println("Enter Attendance Percentage: ");
        double attendance = sc.nextDouble();

        System.out.println("Enter Score: ");
        double score = sc.nextDouble();

        Student s = new Student(rollNo, name, course, attendance, score);

        try {
            String grade = s.calculateGrade();
            System.out.println("Grade: " + grade);
            return sdao.save(s);
        } catch (AttendanceShortageException e) {
            System.out.println("Cannot add student: " + e.getMessage());
            return false;
        }
    }


    @Override
    public void displayAllStudents() {
        List<Student> students = sdao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
            try {
                System.out.println("Grade: " + s.calculateGrade());
            } catch (AttendanceShortageException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void serializeStudents() {
        sdao.serializeStudents(sdao.getAllStudents());
    }

    @Override
    public void deserializeAndDisplayStudents() {
        List<Student> students = sdao.deserializeStudents();
        if (!students.isEmpty()) {
            for (Student s : students) {
                System.out.println(s);
            }
        } else {
            System.out.println("No students found in file.");
        }
    }

    
}
