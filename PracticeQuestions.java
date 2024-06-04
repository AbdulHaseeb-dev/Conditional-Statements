import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        // Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        if (num1 >= 0 && num2 >=0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
       

        // Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You dont have fever");
        }

        // Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.

        System.out.println("enter week number");
        int week = sc.nextInt();
        switch (week) {
            case 1: System.out.println("monday");
                    break;
            case 2: System.out.println("tuesday");
                    break;
            case 3: System.out.println("wednesday");
                    break;
            case 4: System.out.println("thursday");
                    break;
            case 5: System.out.println("friday");
                    break;
            case 6: System.out.println("saturday");
                    break;
            case 7: System.out.println("sunday");
                    break;

        
            default: System.out.println("enter number between 1 to 7");
                break;
        }

        // Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.

        System.out.println("enter year");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
    }
}
