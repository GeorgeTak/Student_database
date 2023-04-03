package com.lab4;

import java.util.Scanner;

public class StudentTest {

    private static void printMenu()
    {
    System.out.println("1,Add Student");
    System.out.println("2,Delete Student");
    System.out.println("3,Print Students");
    System.out.println("4,Find student grade");
    System.out.println("5,Find Student with best grade");
    System.out.println("6,Find average");
    }

    public static void main(String[] args) {
	   University u=new University();
	   Scanner input=new Scanner(System.in);
	   int choice;
    do {
       printMenu();
       choice= input.nextInt();

       switch (choice)
       {
           case 1:
         u.addStudent();
         break;
           case 2:
       u.deleteStudent();
          break;
           case 3:
         u.PrintUniversity();
          break;
           case 4:
               u.searchGrade();
               break;
           case 5:
               System.out.println("Best student:"+u.comprareGrades());
               break;
           case 6:
               System.out.println("Average:"+u.findAvg());
               break;
           default:
               System.out.println("Give another choice:");
               break;

       }


    }while(choice!=0);



    }
}
