package com.example.dakaku.mybuilderdemo;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionComparable {

public static void main(String []args){

    List<Student> list=new ArrayList<>();

    list.add(new Student(1,"Sonali",4));
    list.add(new Student(1,"Conali",4));
    list.add(new Student(1,"Gonali",4));
    list.add(new Student(1,"Donali",4));
    list.add(new Student(1,"Monali",4));

    Collections.sort(list);
    for(Student student:list){
        System.out.println(student.getFname());
    }

}



}
class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(@NonNull Student o) {
        return fname.compareTo(o.fname);
    }
}
