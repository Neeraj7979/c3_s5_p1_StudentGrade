package com.marks;

public class StudentMarks {
    private int math;
    private double biology;
    private int physics;
    private double chemistry;
    private int businessStudies;
    private int finance;
    private float accountancy;
    private int totalMarks;
    public StudentMarks(int physics,int chemistry,double biology){
        this.physics=physics;
        this.chemistry=chemistry;
        this.biology=biology;

    } public StudentMarks(int physics,int chemistry,int math){
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;

    } public StudentMarks(int businessStudies,int finance,float accountancy){
        this.businessStudies=businessStudies;
        this.finance=finance;
        this.accountancy=accountancy;

    }


    public int calculateMarks(int physics,int chemistry,double biology){
       return totalMarks= (int) (physics+chemistry+biology);
    } public int calculateMarks(int physics,int chemistry,int math){
        return totalMarks=physics+chemistry+math;
    }
    public int calculateMarks(int businessStudies,int finance,float accountancy){
       return totalMarks= (int) (businessStudies+finance+accountancy);
    }
}
