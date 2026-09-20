
import java.util.Scanner;

public class Calc {
    public static void main(String [] args) {
        int number1 = 0;
        int number2 = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.print("Enter the first number: ");

            if(scanner.hasNextInt()) {
                number1 = scanner.nextInt(); 
                break; 
            }
            System.out.println("Enter a valid number");
            scanner.next();
        }
        
        while (true) { 
            System.out.print("Enter the second number: ");

            if(scanner.hasNextInt()){
                number2 = scanner.nextInt();
                break;
            }

            System.out.println("Enter a valud number");
            scanner.next();
        }
        

        System.out.print("Enter the sign: ");
        char sign = scanner.next().charAt(0);
        if (sign == '+') {
            int result = add(number1, number2);
            System.out.println(number1 + " + " + number2 +  " = " + result);
        }else if(sign == '-') {
            int result = subtract(number1, number2);
            System.out.println(number1 + " - " + number2 +  " = " + result);
        }else if(sign == '*') {
            int result = multiply(number1, number2);
            System.out.println(number1 + " * " + number2 +  " = " + result);
        }else if(sign == '/') {
            if(number2 == 0){
                System.out.println("Undefined");
            }else {
                int result = quotient(number1, number2);
                System.out.println(number1 + " / " + number2 +  " = " + result);
            }
        }else{
            System.out.println("Invalid sign");
        }
    }

    static int add(int a,int b){
        int sum = a + b;
        return sum;
    }
    static int subtract(int a,int b) {
        int difference = a - b;
        return difference;
    }
    static int multiply(int a , int b) {
        int product = a * b;
        return product;
    }

    static int quotient(int a, int b) {
        int quotient = a / b;
        return quotient;
    }
}