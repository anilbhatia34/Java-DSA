package Array_Example;

import java.util.Scanner;

public class MaxOfBthRow {
    public static int solve(int[][] A, int B) {
        int M = A[0].length;
        int max = Integer.MIN_VALUE;;

        for(int j=0; j< M; j++){
            if(A[B][j] > max){
                max = A[B][j];
            }
        }
        return max;
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int B = scn.nextInt();
        int[][] mat = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int max = solve(mat , B);
        System.out.println(max);
    }
}
