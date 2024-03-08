package Array_Example;

import java.util.Scanner;

public class TransposeOFRectangle {
    //Given a 2D integer array A, return the transpose of A. same diff (2x3,4x7 etc)

    // for Rectangle matrix ,  require new matrix
    public static void main(String[] args) {
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
        int[][] T = new int[M][N]; // M = Row, N =colum;
        for (int i=0; i<N; i++){
            for(int j=0; j<M; j++){
               T[j][i] = mat[i][j];
            }
        }
        for (int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

}
