package ProblemSolving;

public class buySellOneStockBestApproach {
    public static void main(String[] args){

        // Linear time complexity i.e TC : O(n) , SP: O(1)
        int[] A = { 5,2,6,1,4,3};

        int N = A.length;
        int minSoFar =A[0];
        int maxProfit =0;
        for(int i=0; i<N; i++){
            minSoFar = Math.min(minSoFar, A[i]);
            int profit = A[i] -minSoFar;
            maxProfit = Math.max(maxProfit,profit);
        }
        System.out.println(maxProfit) ;
    }
}
