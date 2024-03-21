package ProblemSolving;

public class subarrayinrange {
    public static void main(String[] args){
        int[] A = { 4,2,10,3,12,-2,15};

        int start = 1;
        int end = 4;
        // Brute force : print subarray in  a given range
        for(int i=start; i<=end; i++){
            System.out.print(A[i]+" ");
        }
    }
}
