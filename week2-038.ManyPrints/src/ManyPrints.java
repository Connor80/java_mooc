
import java.util.Scanner;

public class ManyPrints {
    
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= number) {
            printText();
            i++;
        }
    }
}
