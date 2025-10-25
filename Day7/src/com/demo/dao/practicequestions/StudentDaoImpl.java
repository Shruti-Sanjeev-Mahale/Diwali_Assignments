package com.demo.dao.practicequestions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.practicequestions.Student;

public class StudentDaoImpl implements StudentDao {
    private static List<Student> slist;

    static {
        slist = new ArrayList<>();
        slist.add(new Student(1, "Aarav", "CS", 85, 92));
        slist.add(new Student(2, "Ishaan", "IT", 95, 70));
        slist.add(new Student(3, "Ananya", "ECE", 78, 88));
        slist.add(new Student(4, "Vikram", "CS", 95, 95));
        slist.add(new Student(5, "Priya", "IT", 60, 65));
        slist.add(new Student(6, "Manish", "ME", 80, 55));
        slist.add(new Student(7, "Sanya", "CS", 88, 91));
        slist.add(new Student(8, "Rohan", "EE", 67, 74));
        slist.add(new Student(9, "Neha", "CS", 82, 80));
        slist.add(new Student(10, "Arjun", "IT", 90, 85));
    }

    public boolean save(Student s) {
		slist.add(s);
		return true;
	}

    @Override
    public List<Student> getAllStudents() {
        // Sort by decreasing attendance
        slist.sort((s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));
        return slist;
    }

    @Override
    public void serializeStudents(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student s : students) {
                bw.write(s.getRollNo() + "," + s.getSname() + "," + s.getCourse() + ","
                        + s.getAttendancePercentage() + "," + s.getScore());
                bw.newLine();
            }
            System.out.println("Students saved successfully to students.txt!");
        } catch (IOException e) {
            System.out.println("Error writing to students.txt: " + e.getMessage());
        }
    }

    @Override
    public List<Student> deserializeStudents() {
        List<Student> students = new ArrayList<>();
        File file = new File("students.txt");
        if (!file.exists()) {
            System.out.println("File not found. Returning empty list.");
            return students;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int rollNo = Integer.parseInt(parts[0]);
                    String sname = parts[1];
                    String course = parts[2];
                    double attendance = Double.parseDouble(parts[3]);
                    double score = Double.parseDouble(parts[4]);
                    students.add(new Student(rollNo, sname, course, attendance, score));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading students.txt: " + e.getMessage());
        }

        // Sort by decreasing attendance
        students.sort((s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));

        return students;
    }
}
