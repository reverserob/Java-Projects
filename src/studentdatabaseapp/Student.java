package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private String tuitionBalance;
    private static int constOfCourse = 600;
    private static int id = 1001;

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name : ");
        this.lastName = in.nextLine();

        this.gradeYear = setGradeYear();

        System.out.println(firstName + " " + lastName + " " + gradeYear);

        id++;
    }

    private String setGradeYear() {
        Scanner in = new Scanner(System.in);

        System.out.println("Student class level :\n1 - Freshmen\n2 - Junior\n3 - Senior\nEnter student class Code : ");

        int chooseGradeYear = in.nextInt();

        if (chooseGradeYear == 1) {
            return "Freshmen Class";
        } else if (chooseGradeYear == 2) {
            return "Junior Class";
        } else if (chooseGradeYear == 3) {
            return "Senior Class";
        } else {
            return "Not enrolled";
        }

    }
}
