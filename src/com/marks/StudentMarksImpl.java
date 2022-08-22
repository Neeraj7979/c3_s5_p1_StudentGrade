package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks s1=new StudentMarks(70,80,87.6);
        System.out.println("Total Marks of Medical steam student s1");
        double totalMarksMedical= s1.calculateMarks(70,80,87.6);
        System.out.println("totalMarks = " + totalMarksMedical);
        StudentMarks s2=new StudentMarks(70,86,86);
        double totalMarksNonMedical=s2.calculateMarks(70,86,86);
        System.out.println("Total Marks of Non Medical steam student s2");
        System.out.println("totalMarks = " + totalMarksNonMedical);
        StudentMarks s3= new StudentMarks(85,67,88.5f);
        System.out.println("Total Marks Business stream : " +s3.calculateMarks(85,67,86.5f));
    }


}
