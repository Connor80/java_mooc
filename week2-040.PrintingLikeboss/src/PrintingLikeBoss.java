public class PrintingLikeBoss {

    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int j = size - 1;
        while (i <= size) {
            printWhitespaces(j);
            printStars(i);
            j--;
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int j = height - 1;
        int k = 0;
        while (k < height) {
            printWhitespaces(j);
            printStars(i);
            i += 2;
            j--;
            k++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
