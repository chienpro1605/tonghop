package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student st1 = new Student(111,"Hoang");
        Student st2 = new Student(222,"Chien");
        Student st3 = new Student(333,"Nhung");

        st1.dispaly();
        st2.dispaly();
        st3.dispaly();
    }
}
