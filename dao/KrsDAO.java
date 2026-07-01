/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Student;
import model.Course;

public class KrsDAO {
    
    private final ArrayList<Student> listStudent;
    private final ArrayList<Course> listCourse;

    public KrsDAO() {
        this.listStudent = new ArrayList<>();
        this.listCourse = new ArrayList<>();
    }

    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public void addCourse(Course course) {
        listCourse.add(course);
    }

    public ArrayList<Student> getAllStudents() {
        return listStudent;
    }

    public ArrayList<Course> getAllCourses() {
        return listCourse;
    }
}