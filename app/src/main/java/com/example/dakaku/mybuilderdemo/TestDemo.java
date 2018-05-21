package com.example.dakaku.mybuilderdemo;

public class TestDemo{


    public static void main(String []args){
        MyDemo myDemo=new MyDemo.Builder().name("Mary").phone(27141212).build();
        System.out.println(myDemo.getName());
        System.out.println(myDemo.getPhone());

    }
}
