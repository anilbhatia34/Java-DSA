package Array_Example;

import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // Create Array of specific length from User Input
        int N = scn.nextInt();
        int[] A = new int[N];

        for(int i =0 ; i<N; i++){
            A[i]= scn.nextInt();
        }
        //find largest element in enter array A
        int largest = A[0];  // Assume first Element is the largest
        for(int i =0; i<N-1;i++){
            if(A[i] > largest){
                largest = A[i];
            }
        }
        System.out.println("Largest Element in the Enter Array is :" +largest);
    }
}
