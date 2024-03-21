package ProblemSolving;

public class PrimeCount {
    public static int solve(int A) {
        int factor = 0;

        for (int x = 2; x <= A; x++) {
            if (isPrime(x)) {
                factor++;
            }
        }
        return factor;
    }

    public static boolean isPrime(int x) {
        int count = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i == x / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        int A = 19;
        int count = solve(A);
        System.out.println(count);
    }
}
