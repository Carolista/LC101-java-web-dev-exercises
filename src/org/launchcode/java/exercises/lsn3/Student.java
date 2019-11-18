package org.launchcode.java.exercises.lsn3;

public class Student {

    private static int nextStudentId = 1;
    private String name = "Caroline Jones";
    private int studentId = 3953498;
    private int numberOfCredits = 1;
    private double gpa = 4.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {

        // Determine grade level based on numberOfCredits
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }

    }

    public void addGrade(int courseCredits, double grade) {

        // update numberOfCredits & gpa
        double currentTotalQuality = this.numberOfCredits * this.gpa;
        double newQuality = courseCredits * grade;
        double newTotalQuality = currentTotalQuality + newQuality;
        this.numberOfCredits += courseCredits;
        this.gpa = newTotalQuality / numberOfCredits;

    }

    // Overrides

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    protected void setStudentId(String aStudentId) {
        name = aStudentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(String aNumberOfCredits) {
        name = aNumberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(String aGpa) {
        name = aGpa;
    }
}
