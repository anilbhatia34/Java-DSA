package Array_Example;

import java.util.Scanner;

public class IdenticalMetrix {
    public static int identical(int[][] A) {
        int N = A.length;
        for(int i=0; i<N;i++){
            for(int j=0; j<N; j++){
                if(i==j && A[i][j]!=1){
                    return 0;
                }else if( i!=j && A[i][j]!=0){
                    return 0;
                }
            }
        }
        return 1;
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
        int res = identical(mat);
        System.out.println(res);
    }
}
