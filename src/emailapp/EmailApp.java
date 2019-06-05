package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void  main(String[] args){
        //Email eml = new Email("Jhon", "Smith");

        System.out.println("Enter Name : ");
        Scanner name= new Scanner(System.in);
        String nameChoice = name.next();
        System.out.println("Enter Lastname : ");
        Scanner lastname= new Scanner(System.in);
        String lastnameChoice = lastname.next();

        Email eml = new Email(nameChoice, lastnameChoice);

    }
}
