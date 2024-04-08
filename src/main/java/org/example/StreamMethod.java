package org.example;

import java.util.Comparator;
import java.util.List;

public class StreamMethod {

    public static List<Student> getCuriousStudents(List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getCoursesCount).reversed())
                .limit(3)
                .toList();

    }

    public static List<Student> whoGoesToCourse(List<Student> studentList, Course course) {
        return studentList.stream()
                .filter(x -> x.getAllCourses().contains(course))
                .toList();
    }
}
