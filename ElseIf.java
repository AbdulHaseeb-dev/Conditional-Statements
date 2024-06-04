import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        int age = 15;
        if (age >=18) {
            System.out.println("Adult");
        }
        else if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }

        //  Income tax calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >=500000 && income <1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is : " + tax);

        sc.close();

        //  Print the largest of 3 numbers

        int a = 10; 
        int b = 5;
        int c = 2;

        if ((a >= b) && (a >= c)) {
            System.out.println("a is the largest");
        }
        else if (b >= c) {
            System.out.println("b is the largest");
        }
        else {
            System.out.println("c is the largest");
        }
    }
}
