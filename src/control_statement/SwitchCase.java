package control_statement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int i ,j;
        char operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        i = scanner.nextInt();
        System.out.println("Enter the second number");
        j = scanner.nextInt();
        System.out.println("Enter operator");
        operator=scanner.next().charAt(0);

        double output=0.0;

        switch (operator){
            case '+':
                output = i + j;
                break;
            case '-':
                output = i - j;
                break;
            case '*':
                output = i * j;
                break;
            case '/':
                output = i / j;
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println(i+" "+operator+" "+j+" = "+output);
    }
}