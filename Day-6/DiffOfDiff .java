public class DiffOfDiff {
    public static void main(String[] args) {
        int n = 5;
        int num = 2;
        int diff = 3;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num = num + diff;
            diff += 2;
        }
    }
}