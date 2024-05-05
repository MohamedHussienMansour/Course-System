/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.online_course_system.Test;

import com.mycompany.online_course_system.Student;

/**
 *
 * @author KHALID
 */

public class TestStudent {
    public static void main(String[] args) {
        try {
            // Creating a new student object
            Student student = new Student("Emily Clark", "+15005551234", "789 Pine St", "female", "Australia", "S1001", "rich");
            // Adding courses to the student's record
            student.addCourse("Introduction to Psychology");
            student.addCourse("Modern Art");
            System.out.println(student);

            // Testing the remove course functionality
            student.removeCourse("Introduction to Psychology");
            System.out.println("After removing a course:");
            System.out.println(student);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

