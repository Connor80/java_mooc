
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstNumber = Integer.parseInt(reader.nextLine());  
        
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your: ");
        int secondNumber = Integer.parseInt(reader.nextLine());  
        
        int total = firstNumber + secondNumber;
        
        System.out.println(firstName + " and " + secondName + " are " + 
                total + " years old in total.");     

    }
}
