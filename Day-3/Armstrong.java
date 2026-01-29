import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
        int original = n;

        int count = 0;
        int temp = n;

        // count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = n;

        // calculate power sum
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp / 10;
        }

            if (sum == original)
                System.out.println("Armstrong");
            else
                System.out.println("Not Armstrong");
        }
    }
}

