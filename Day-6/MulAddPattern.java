public class MulAddPattern {
    public static void main(String[] args) {
        int n = 7;
        int num = 3;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            if (i % 2 != 0)
                num = num * 2;
            else
                num = num + 1;
        }
    }
}

