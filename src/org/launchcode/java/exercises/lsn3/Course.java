package org.launchcode.java.exercises.lsn3;

import java.util.HashMap;
import java.util.Objects;

public class Course {

    private String code;
    private String title;
    private HashMap<Integer,String> syllabus;
    // syllabus would hold the class number and a description of class content

    public Course(String code, String title, HashMap<Integer, String> syllabus) {
        this.code = code;
        this.title = title;
        this.syllabus = syllabus;
    }

    // Overrides

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return getCode().equals(course.getCode()) &&
                getTitle().equals(course.getTitle());
    }

    // Getters & Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<Integer, String> getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(HashMap<Integer, String> syllabus) {
        this.syllabus = syllabus;
    }

}
