package Array_Example;

import java.util.Scanner;

public class RotateMetrixBy90 {

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
        // reverse each row


        for (int i=0; i<T.length; i++){
            int first = 0;
            int last =  T[0].length-1;
            while(first <last){
                int temp = T[i][first];
                T[i][first] = T[i][last];
                T[i][last] = temp;
                first++;
                last --;
            }
        }
        for (int i=0; i<T.length; i++){
            for(int j=0; j<T[0].length; j++){
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}
