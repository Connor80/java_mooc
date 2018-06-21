
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        if (points < 30) {
            String grade = "failed";
            System.out.println("Grade: " + grade);
        } else if (points < 35) {
            int grade = 1;
            System.out.println("Grade: " + grade);
        } else if (points < 40) {
            int grade = 2;
            System.out.println("Grade: " + grade);
        } else if (points < 45) {
            int grade = 3;
            System.out.println("Grade: " + grade);
        } else if (points < 50) {
            int grade = 4;
            System.out.println("Grade: " + grade);
        } else {
            int grade = 5;
            System.out.println("Grade: " + grade);
        }

    }
}
