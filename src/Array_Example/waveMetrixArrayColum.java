package Array_Example;
import java.util.*;
public class waveMetrixArrayColum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; i++) {
                mat[i][j] = scn.nextInt();
            }
        }

        for (int j = 0; j < N; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < N; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
