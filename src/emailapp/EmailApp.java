package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void  main(String[] args){
        //Email eml = new Email("Jhon", "Smith");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String nameChoice = in.nextLine();

        System.out.println("Enter Lastname : ");
        String lastNameChoice = in.nextLine();

        Email eml = new Email(nameChoice, lastNameChoice);
        eml.setAlternateEmail("js@gmail.com");
        System.out.println(eml.getAlternateEmail());
        System.out.println(eml.showInfo());

    }
}
