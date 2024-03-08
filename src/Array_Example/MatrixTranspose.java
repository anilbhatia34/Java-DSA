package Array_Example;
import java.util.*;

public class MatrixTranspose {
    //Given a 2D integer array A, return the transpose of A. same size (2x2,4x4 etc)
    // for equal size matrix always use the upper half of 2D matrix.
    // for equal size matrix , we don't require new matrix
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int N = scn.nextInt();
       int[][] mat = new int[N][N];
       for (int i=0; i<N; i++){
           for(int j=0; j<N; j++){
                mat[i][j]= scn.nextInt();
           }
       }
       for (int i=0; i<N; i++){
           for(int j=0; j<N; j++){
               if(i<=j){
                   int temp = mat[i][j];
                   mat[i][j] = mat[j][i];
                   mat[j][i] = temp;
               }
           }
       }
       for (int i=0; i<N; i++){
           for(int j=0; j<N; j++){
               System.out.print(mat[i][j] + " ");
           }
           System.out.println();
       }
   }

}
