package ProblemSolving;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 5;
        int OptimCount = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    OptimCount++;
                } else {
                    OptimCount += 2;
                }
            }
        }
        if (OptimCount == 2){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is Not Prime");
        }
    }
}
