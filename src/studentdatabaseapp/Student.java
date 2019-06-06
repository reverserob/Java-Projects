package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses=null;
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name : ");
        this.lastName = in.nextLine();

        this.gradeYear = setGradeYear();

        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + studentID);


    }

    private String setGradeYear() {
        Scanner in = new Scanner(System.in);

        System.out.println("Student class level :\n1 - Freshmen\n2 - Junior\n3 - Senior\nEnter student class level : ");

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

    private String setStudentId() {
        id++;
        return this.studentID = gradeYear + id;
    }

    public void enroll() {
        do {
            System.out.println("Enter a course to enroll (Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") && !course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }while (1 !=0);

        System.out.println("Enrolled in : " + courses);
        System.out.println("Tuition Balance : " + tuitionBalance);
    }

    public void viewBalance(){
        System.out.println("Your balance is : $"+tuitionBalance);
    }

    public void payTuition(){
        System.out.println("Enter your payment : $");

        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();


        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);

        viewBalance();
    }
}
