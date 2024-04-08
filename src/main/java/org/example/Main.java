package org.example;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("english course");
        Course course2 = new Course("spanish course");
        Course course3 = new Course("java course");
        Course course4 = new Course("python course");
        Course course5 = new Course("c++ course");
        Course course6 = new Course("c# course");
        Course course7 = new Course("law course");
        Course course8 = new Course("programming course");
        Course course9 = new Course("teaching course");
        Course course10 = new Course("drive course");

        List<Course> firstList = new ArrayList<>();
        firstList.add(course1);
        firstList.add(course2);
        firstList.add(course3);
        firstList.add(course7);

        List<Course> secondList = new ArrayList<>();
        secondList.add(course4);

        List<Course> thirsList = new ArrayList<>();
        thirsList.add(course6);
        thirsList.add(course1);

        List<Course> fourthList = new ArrayList<>();
        fourthList.add(course7);
        fourthList.add(course8);
        fourthList.add(course9);
        fourthList.add(course10);
        fourthList.add(course1);

        List<Course> fifthList = new ArrayList<>();
        fifthList.add(course2);
        fifthList.add(course10);
        fifthList.add(course1);

        List<Course> sixthList = new ArrayList<>();
        sixthList.add(course1);
        sixthList.add(course2);

        List<Course> seventhList = new ArrayList<>();
        seventhList.add(course5);
        seventhList.add(course1);
        seventhList.add(course8);
        seventhList.add(course9);

        Student student1 = new Student("Valera", firstList);
        Student student2 = new Student("Diana", secondList);
        Student student3 = new Student("Max", thirsList);
        Student student4 = new Student("Nika", fourthList);
        Student student5 = new Student("V", firstList);
        Student student6 = new Student("Miko", fifthList);
        Student student7 = new Student("Piper", sixthList);
        Student student8 = new Student("UUU", thirsList);
        Student student9 = new Student("Marina", seventhList);
        Student student10 = new Student("Elena", fourthList);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentsList.add(student6);
        studentsList.add(student7);
        studentsList.add(student8);
        studentsList.add(student9);
        studentsList.add(student10);
    }
}