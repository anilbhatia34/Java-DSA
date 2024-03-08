package Array_Example;

import java.util.Scanner;

public class RevereMetricsRow {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] mat = new int[N][M];    // N -> Row , M-> Column
        // Let crete new metric T for size M, N

        for (int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                mat[i][j]= scn.nextInt();
            }
        }
        //reverse each row .
        for(int i=0; i<N; i++){

       // N=0    // [ 0, 1 ------ M-1]
             int first =0;
             int last = M-1;
             while (first < last){
                 int temp = mat[i][first];
                 mat[i][first] = mat[i][last];
                 mat[i][last] = temp;
                 first++;
                 last --;
             }
        }
        for (int i =0; i < N; i++){
            for (int j=0; j<M; j++){
               System.out.print(mat[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
