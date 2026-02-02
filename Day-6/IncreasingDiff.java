public class IncreasingDiff {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        int diff = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num = num + diff;
            diff++;
        }
    }
}
