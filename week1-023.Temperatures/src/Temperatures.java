
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type a temperature: ");
            double temp = Double.parseDouble(reader.nextLine());
            if (temp > -31 && temp < 41) {
                Graph.addNumber(temp);
            }
        }
    }
}
