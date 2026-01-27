import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            if (a > b)
                System.out.println("A is greater");
            else
                System.out.println("B is greater");
        }
    }
}
