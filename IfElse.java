import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }

        // Print the largest of the 2 numbers

        int A = 10;
        int B = 5;
        if (A >= B) {
            System.out.println("A is the Largest");
        } else {
            System.out.println("B is the Largest");
        }

        // Print if a number is even or odd

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

        if (num %2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}