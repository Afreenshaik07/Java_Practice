public class TriangleSeries {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 2; i <= n + 1; i++) {
            System.out.print(num + " ");
            num = num + i;
        }
    }
}
