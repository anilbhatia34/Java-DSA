package Array_Example;

public class FindSecondMaxElement {
    public static void main(String[] args){
        int[] A = { 42,33,3,-2,5,19};
        int N = A.length;
        int max1 =0;
        int max2=0;
        if(A[1]>A[0]){
            max1 =A[1];
            max2 = A[0];
        }else {
            max1 =A[0];
            max2 = A[1];
        }

        for(int i =2; i<N; i++){
            if(A[i]> max1){
                max2 = max1;
                max1 = A[i];
            } else if(A[i] > max2) {
                max2 = A[i];
            }
        }
        System.out.println(max1+ " " +max2);

    }
}
