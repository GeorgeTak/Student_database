package com.lab4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class University
{
  private  String name;
  private ArrayList<Student> students=new ArrayList<>();

   public void addStudent()
   {
     //String sname;
       Student s=new Student();
   Scanner keyboard=new Scanner(System.in);
   System.out.println("Give student's name:");
   s.setName(keyboard.next());
   //sname=keyboard.next();
   //s.setName(sname);
   System.out.println("Give student's surname");
   s.setSurname(keyboard.next());
   System.out.println("Give student's grade");
   s.setGrade(keyboard.nextDouble());
   s.setAM();
   students.add(s);
   }

   public  void readName()
   {
    Scanner input=new Scanner(System.in);
    System.out.println("Give University's name:");
    name=input.nextLine();


   }

  public void PrintUniversity()
  {
     System.out.println(name);
      for(Student s:students){
          System.out.println(s);
      }
  }

  public Student comprareGrades()
  {
      double max=students.get(0).getGrade();
      int index=0;
      for(int i=0; i<students.size();i++)
      {

       if(students.get(i).getGrade()>max)
           max=students.get(i).getGrade();
       index=i;

      }
    return  students.get(index);

  }

   public  void deleteStudent()
   {
       String ssname,ssurname;
       Scanner keyboard=new Scanner(System.in);
       Iterator<Student> it=students.iterator();
       System.out.println("Give student's name to delete:");
       ssname=keyboard.next();
       System.out.println("Give student's surname to delete:");
       ssurname=keyboard.next();
       while (it.hasNext()){
           Student temp= it.next();
           if(temp.getName().equals(ssname)&&temp.getSurname().equals(ssurname))
               it.remove();
           System.out.println("Student removed");
           break;
       }
   }
   public  void searchGrade()
   {
   String ssname,ssurname;
   Scanner keyboard=new Scanner(System.in);
   System.out.println("Give student name you are searching");
   ssname=keyboard.next();
   System.out.println("Give student surname you are searching");
   ssurname=keyboard.next();
   for(Student s:students)
   {
if(s.getName().equals(ssname)&&s.getSurname().equals(ssurname))
   System.out.println("The grade of the student is:"+s.getGrade());

   }

   }

   public double findAvg()
   {
   double sum=0;
   for(Student s:students)
       sum+=s.getGrade();
   return sum/students.size();

   }




}
