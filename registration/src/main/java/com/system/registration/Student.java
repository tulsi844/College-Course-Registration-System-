package com.system.registration;

public class Student{
    // These variable names MUST match the keys in your JavaScript 'data' object
    private String fullName;
    private String email;
    private String phone;
    private String qualification;
    private String experience;
    private String course;

    // Default Constructor (Required by Spring Boot)
    public Student() {}

    // Constructor with fields
    public Student(String fullName, String email, String phone, String qualification, String experience, String course) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.qualification = qualification;
        this.experience = experience;
        this.course = course;
    }

    // Getters and Setters (Required for Spring to transfer data)
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}