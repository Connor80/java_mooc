
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        
        double cir = 2 * Math.PI * radius;
        
        System.out.println("Circumference of the circle: " + cir);

    }
}
