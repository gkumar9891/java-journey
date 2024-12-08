package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    // Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Setter for studentAddress
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    // Default Constructor
    public Student() {
        super();
    }

    // Parameterized Constructor
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}

