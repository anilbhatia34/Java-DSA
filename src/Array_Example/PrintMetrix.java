package Array_Example;
import java.util.*;
public class PrintMetrix {
    public static void main(String[] args){

        Scanner scn =new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] mat = new int[N][M];
        int max = Integer.MIN_VALUE ;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M;j++){
                mat[i][j] = scn.nextInt();
            }
        }
       for (int i=0; i<N; i++){
           for(int j=0; j<M; j++){
               if(max < mat[i][j]){
                   max = mat[i][j];
               }
           }
       }
     System.out.println("max element in 2D array :" +max);

    }
}
