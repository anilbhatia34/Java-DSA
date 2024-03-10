package Array_Example;

import java.util.Scanner;

public class MinOf2dArray {

        public static int solve(int[][] A) {
            int N = A.length;
            int M= A[0].length;
            int min = A[0][0];

            for (int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(A[i][j] < min){
                        min = A[i][j];
                    }
                }
            }
            return min;
        }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
         int N = scn.nextInt();
         int M = scn.nextInt();
         int[][] mat = new int[N][M];
         for(int i=0; i<N; i++){
             for(int j=0; j<M; j++){
                 mat[i][j] = scn.nextInt();
             }
         }
         int count = solve(mat);
         System.out.println(count);
    }
}
