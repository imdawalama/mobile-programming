package com.example.jalbandi.model;

public class StudentModel {
  public  int sn;
   public String name;
   public Integer rollNo;

    public StudentModel(int sn,String name, int rollNo){
        this.sn =sn;
        this.name = name;
        this.rollNo = rollNo;
    }
      public  int getSn(){
        return sn;
      }
      public String getName(){
        return name;
      }
      public int getRollNo(){
        return  rollNo;
      }

}
