package ProblemSolving;

public class prefixSum {
    public static void main(String[] args){
        int[] A = { 1,2,3,4,5,6};
        int N = A.length;
        //prefix sum = { 1,3,6,10,15,21 };
        int[] prefixSum= new int[N];
        prefixSum[0] = A[0];
        for(int i= 1; i< N; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
        for (int i=0; i< N; i++){
            System.out.print( prefixSum[i] + " ");
        }
    }
}
