import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1: System.out.println("burger");
                    break;
            case 2: System.out.println("pizza");  
                    break;
            case 3: System.out.println("mango");
                    break;              
        
            default: System.out.println("you are dreaming");
                    break;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);            
                        break;
            case '/' : System.out.println(a/b); 
                        break;
            case '%' : System.out.println(a%b);                       
                        break;
            default: System.out.println("wrong operator");
                        break;               
        }
        sc.close();
    }
}
