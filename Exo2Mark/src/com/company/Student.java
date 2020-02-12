package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String  studentName;
    private String studentFirstName;
    private int year;
    private Mark marks[];

    public Student( String studentName , String studentFirstName , int year , Mark[] marks ) {
        this.studentName = studentName;
        this.studentFirstName = studentFirstName;
        this.year = year;
        this.marks = marks;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName( String studentName ) {
        this.studentName = studentName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName( String studentFirstName ) {
        this.studentFirstName = studentFirstName;
    }

    public int getYear() {
        return year;
    }

    public void setYear( int year ) {
        this.year = year;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks( Mark[] marks ) {
        this.marks = marks;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Student student = (Student) o;
        return year == student.year &&
                Objects.equals( studentName , student.studentName ) &&
                Objects.equals( studentFirstName , student.studentFirstName ) &&
                Arrays.equals( marks , student.marks );
    }

    @Override
    public int hashCode() {
        int result = Objects.hash( studentName , studentFirstName , year );
        result = 31 * result + Arrays.hashCode( marks );
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", year=" + year +
                ", marks=" + Arrays.toString( marks ) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone( );
    }
}
