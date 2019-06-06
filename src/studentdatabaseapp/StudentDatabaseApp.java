package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void  main(String[] args) {
//        Student stu1 = new Student();
//        stu1.enroll();
//        stu1.payTuition();
//        System.out.println(stu1.toString());

        System.out.println("Enter number of student to enroll : ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        for (int n=0; n<numOfStudent; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }

}
