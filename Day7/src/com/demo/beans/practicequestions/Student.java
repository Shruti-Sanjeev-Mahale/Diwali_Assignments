//Create a class Student with following details: rollno, sname, course,
//attendance_percentage, score
//1. Add constructors - default and parameterized
//2. Add method – calculateGrade()
//3. If the attendance_percentage is lesser than 60%, throw a user defined exception
//and print appropriate message
//4. Store 10 student objects in file using serialization
//5. Create appropriate collection for storing students in the decreasing order of
//attendance_percentage

package com.demo.beans.practicequestions;

import java.io.Serializable;
import com.demo.exceptions.practicequestions.AttendanceShortageException;

public class Student implements Serializable {
    private int rollNo;
    private String sname;
    private String course;
    private double attendancePercentage;
    private double score;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(int rollNo, String sname, String course, double attendancePercentage, double score) {
        this.rollNo = rollNo;
        this.sname = sname;
        this.course = course;
        this.attendancePercentage = attendancePercentage;
        this.score = score;
    }

    // Getters
    public int getRollNo() { return rollNo; }
    public String getSname() { return sname; }
    public String getCourse() { return course; }
    public double getAttendancePercentage() { return attendancePercentage; }
    public double getScore() { return score; }

    // Method to calculate grade
    public String calculateGrade() throws AttendanceShortageException {
        if(attendancePercentage < 60) {
            throw new AttendanceShortageException("Attendance less than 60%! Student: " + sname);
        }
        if(score >= 90) return "A+";
        else if(score >= 75) return "A";
        else if(score >= 60) return "B";
        else if(score >= 50) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + sname + ", Course: " + course +
                ", Attendance: " + attendancePercentage + "%, Score: " + score;
    }
}
