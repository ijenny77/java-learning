
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1;
        int number2 ;
        try{
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            int result = number1/number2;
            System.out.println("Result: " + result);
        }catch(InputMismatchException e){
            System.out.println("That's not a valid number!");
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero!");
        }
    }
}