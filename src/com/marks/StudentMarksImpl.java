package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks s1=new StudentMarks(70,80,87.6);

        double totalMarks= s1.calculateMarks(70,80,87.6);
        System.out.println("totalMarks = " + totalMarks);
    }


}
