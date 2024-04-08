package org.example;

import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public int getCoursesCount() {
        return this.courses.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getCoursesCount() - this.getCoursesCount();
    }
}
