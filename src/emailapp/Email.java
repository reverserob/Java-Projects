package emailapp;
import java.beans.EventSetDescriptor;
import java.util.*;

public class Email {
    private String firstName;
    private  String lastName;
    private String passowrd;
    private String department;
    private int defaultPasswordLenght=8;
    private String companySuffix="aeycompany.com";
    private int mailboxCapacity;
    private String alternateEmail;


    public Email (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

        System.out.println("EMAIL CREATED : "+ this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department is : " + this.department);
        this.passowrd= randomPassword(defaultPasswordLenght);
        System.out.println(" Your Password is : "+this.passowrd);
        String email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase()+"@"+ this.department + "."+ this.companySuffix;
        System.out.println(" Your Email is : "+email);
    }

    private String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none\n Enter Department Code : ");
        Scanner in= new Scanner(System.in);
        int deepChoice = in.nextInt();
        if (deepChoice == 1){return "sales";}
    	else if(deepChoice == 2) {return "development";}
    	else if(deepChoice == 3) {return "accounting";}
    	else if(deepChoice == 0) {return "none";}
        else {return null;}
    }

    private String randomPassword(int lenght){
         // String passwordSet = "[^a-zA-Z0-9\\s][!@$%#]";
         String passwordSet = "ABCDEFGHILMNOPQRSTUVZ123456789!@$%#]";
         char[] password = new char[lenght];
         for (int i=0; i<lenght; i++){
             int rand = (int) (Math.random()* passwordSet.length());
             password[i] = passwordSet.charAt(rand);
         }
        return new String(password);
    }
}
