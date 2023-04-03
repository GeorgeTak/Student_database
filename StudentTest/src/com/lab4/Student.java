package com.lab4;
public class Student
{

    private String name;
    private String surname;
    private double grade;
    private static int count=0;
    private int am;


    public void setName(String ssname)
    {
         name=ssname;
    }

    public String getName()
    {
        return name;
    }


    public void setSurname(String ssurname)
    {
        surname=ssurname;
    }


    public String getSurname()
    {
       return surname;
    }

    public  void setGrade(double ggrade)
    {
    grade=ggrade;
    }

    public  double getGrade()
    {
     return grade;
    }


    public int increment()
    {

        return  count++;
    }

    public void setAM()
    {
     am=increment();
    /*count++;
    am=count;
    */

    }


    public  String toString()
    {
        String s=String.format("Student %d \n Name:%s\n Surnname:%s\n Grade:%f\n",am,name,surname,grade);
        return s;

    }






}
