/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online_course_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KHALID
 */


public class Instructor extends Person {
    private int graduationYear;
    private String graduationUniversity;
    private int yearsOfExperience;
    private final List<String> coursesExplained;
    private List<String> students;

    // Constructor
    public Instructor(String name, String num, String address, String gender, String nationality,
                      int graduationYear, String graduationUniversity, int yearsOfExperience) {
        super(name, num, address, gender, nationality);
        setGraduationYear(graduationYear);
        setGraduationUniversity(graduationUniversity);
        setYearsOfExperience(yearsOfExperience);
        this.coursesExplained = new ArrayList<>();
    }

    // Setters with validation
    public void setGraduationYear(int graduationYear) {
        if (graduationYear < 1900 || graduationYear > 2023) {
            throw new IllegalArgumentException("Invalid graduation year: Year must be between 1900 and 2023.");
        }
        this.graduationYear = graduationYear;
    }

    public void setGraduationUniversity(String graduationUniversity) {
        if (graduationUniversity == null || graduationUniversity.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid university name: University name cannot be empty.");
        }
        this.graduationUniversity = graduationUniversity;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Invalid years of experience: Years of experience cannot be negative.");
        }
        this.yearsOfExperience = yearsOfExperience;
    }

    // Methods for course management
    public void addCourse(String course) {
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid course: Course name cannot be empty.");
        }
        coursesExplained.add(course);
    }

    public void removeCourse(String course) {
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid course: Course name cannot be empty.");
        }
        
        if (!coursesExplained.contains(course)) {
            throw new IllegalArgumentException("Course not found: The specified course does not exist in the list.");
        }
        coursesExplained.remove(course);
    }

    public List<String> getCoursesExplained() {
        return new ArrayList<>(coursesExplained);
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Graduation Year: " + graduationYear + "\n" +
               "Graduation University: " + graduationUniversity + "\n" +
               "Years of Experience: " + yearsOfExperience + "\n" +
               "Courses Explained: " + String.join(", ", coursesExplained);
    }
}