package ProblemSolving;

public class smallestSubArrayMinMaxElement {
    public static void main(String[] args){
        int[] A = { 2,2,6,4,5,1,5,2,6,4,1};
        int N = A.length;
        int min = A[0];
        int max =A[0];
        int last_Min_i = -1;
        int last_Max_i =-1;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<N;i++){
            if(A[i] > max){
                max=A[i];
            }
            if(A[i] < min) {
                min =A[i];
            }
        }
       for(int i=0; i<N; i++){
            if(A[i] == min){
                last_Min_i =i;
                if(last_Min_i!=-1){
                    int len = i-last_Max_i+1;
                    ans = Math.min(len,ans);
                }
            }
           if(A[i] == max){
               last_Max_i =i;
               if(last_Min_i!=-1){
                   int len = i-last_Min_i+1;
                   ans = Math.min(len,ans);
               }
           }
        }
       System.out.println(ans);
    }
}
