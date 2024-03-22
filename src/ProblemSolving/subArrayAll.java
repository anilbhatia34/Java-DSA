package ProblemSolving;

public class subArrayAll {
    public static void main(String[] args){

        // Brute Force
        int[] A = { 4,2,10,3,12,-2,15};
        int N = A.length;
        for (int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
        }
        
    }
}
