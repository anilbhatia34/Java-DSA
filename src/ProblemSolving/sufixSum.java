package ProblemSolving;

public class sufixSum {
    public static void main(String[] args){
        int[] A = { 1,2,3,4};
        int N = A.length;
        //prefix sum = { 1,3,6,10,15,21 };
        int[] sufiSum= new int[N];
        sufiSum[N-1] = A[N-1];
        for(int i= N-2; i>=0; i--){
            sufiSum[i] = sufiSum[i+1] + A[i];
        }
        for (int i=0; i< N; i++){
            System.out.print( sufiSum[i] + " ");
        }
    }
}
