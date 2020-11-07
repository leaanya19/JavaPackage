package homework;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= input.nextLine();
        System.out.println("Enter your daughter age");
        int age=input.nextInt();
        System.out.println("My daughter age is "+age);
        System.out.println("Yes she is coming today");
        boolean iscoming=input.nextBoolean();
        System.out.println("My daughter is coming "+iscoming);
        System.out.println("No she is not coming today");
        boolean isnotcoming=input.nextBoolean();
        System.out.println("My dayghter is not coming "+isnotcoming);


        System.out.println("How much is my salary");
        float salary=input.nextFloat();
        System.out.println("My salary is "+salary);


        input.close();
    }

}
