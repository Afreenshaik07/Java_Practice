public class AlternateSquare {
    public static void main(String[] args) {
        int n = 6;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(num * num + " ");
            } else {
                System.out.print(num * num + 1 + " ");
                num++;
            }
        }
    }
}
