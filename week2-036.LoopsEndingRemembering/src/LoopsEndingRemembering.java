import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number;
        int sum = 0;
        int typed = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                even ++;
            } else {
                odd++;
            }
            sum += number;
            typed++;
            System.out.println("Type numbers: ");  
        }
        double avg = (double) sum / typed;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + typed);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
