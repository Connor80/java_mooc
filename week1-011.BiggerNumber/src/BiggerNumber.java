
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        int big = Math.max(firstNumber, secondNumber);
        
        System.out.println("The bigger number of the two numbers given was: " + big);
     }
}
