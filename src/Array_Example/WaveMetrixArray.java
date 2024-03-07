package Array_Example;
import java.util.*;

public class WaveMetrixArray {

    public  static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] mat = new int[N][M];

        for (int i=0; i<N; i++) {
            for (int j=0; j<M;j++){
                mat[i][j] = scn.nextInt();
            }

        }
        for(int i =0; i<N; i++){
            if( i%2 == 0) {
                for(int j = 0; j<M; j++){
                    System.out.print(" " + mat[i][j]);
                }
            }else {
                for(int j = M-1; j>=0;j--){
                    System.out.print(" " + mat[i][j]);
                }
            }
            System.out.println();
        }
//    2 4 5 6     00 01 02 03
//    7 8 9 8     10 11 12 13
//    5 6 7 8     20 21 22 23
//    2 3 4 5

        //wave from
//    2 4 5 6
//    8 9 8 7
//    5 6 7 8
//    5 4 3 2
    }



}
