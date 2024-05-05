/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.online_course_system.Test;

import com.mycompany.online_course_system.Instructor;

/**
 *
 * @author KHALID
 */

public class TestInstructor {
    public static void main(String[] args) {
        try {
            Instructor instructor = new Instructor("Alice Johnson", "+1987654321", "456 Elm St", "female", "Canada", 2005, "University of Toronto", 10);
            instructor.addCourse("Data Structures");
            instructor.addCourse("Algorithms");
            System.out.println(instructor);

            // Testing the remove course functionality
            instructor.removeCourse("Data Structures");
            System.out.println("After removing a course:");
            System.out.println(instructor);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

