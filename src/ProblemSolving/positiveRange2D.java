package ProblemSolving;

public class positiveRange2D {
    public static void main(String[] args){
        int[] A = { 4,5,7,-8,9,4,-5};
        int N = A.length;
        int[][] B = {{2,5},{4,5},{1,2},{0,4}};
        int[] count  = new int[N];
        // add element replace element with 1 or 0 based on negtive and postive
        for(int i=0; i<N; i++){
            if(A[i]> 0 ){
                count[i] = 1;
            } else {
                count[i] = 0;
            }
        }
        // create prefix sum array
        int[] pre = new int[N];
        pre[0] = count[0];
        for(int i =1; i<N; i++){
            pre[i] = pre[i-1]+ count[i];
        }
        // Create ans array of length B.
        int[] ans = new int[B.length];
        for(int i =0; i< B.length; i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l==0){
                ans[i] = pre[r];
            }else {
                ans[i] = pre[r] - pre[l-1];
            }
        }

        // print ans array
        for(int i=0; i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
