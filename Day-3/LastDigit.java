import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int lastDigit = n % 10;

            System.out.println(lastDigit);
        }
    }
}
