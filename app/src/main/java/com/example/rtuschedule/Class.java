package com.example.rtuschedule;

public class Class {
    private String classroom;
    private String subject;
    private String type;
    private String teacher;

    public static Class empty = new Class();

    private Class() {
        classroom = "";
        subject = "";
        type = "";
        teacher = "";
    }

    public Class(String classroom, String subject, String type, String teacher) {
        this.classroom = classroom;
        this.subject = subject;
        this.type = type;
        this.teacher = teacher;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
