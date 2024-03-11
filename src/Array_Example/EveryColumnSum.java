package Array_Example;

import java.util.Scanner;

public class EveryColumnSum {
    public static int[] everySum(int[][] A) {
        int N = A.length;
        int M= A[0].length;
        int[] arr = new int[M];

        for(int i=0; i< M; i++){
            int max = 0;
            for(int j=0; j<N; j++){
                max = max+ A[j][i];
            }
            arr[i] = max;
        }
        return arr;
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
        int[] res = everySum(mat);
        for(int i=0; i<res.length;i++){

            System.out.print(res[i]+ " ");

        }
    }
}
