package slowPaceJune;

public class countFactorBruteForce {

    public static void main(String args[]){
        int N = 100;
        int count =0;
        for(int i=1; i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        System.out.print(count);
    }
}
