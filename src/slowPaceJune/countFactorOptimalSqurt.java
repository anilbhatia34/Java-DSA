package slowPaceJune;

public class countFactorOptimalSqurt {
    public static void main(String args[]){
        int N = 100;
        int count =0;
        for(int i=1; i*i<=N;i++){
            if(N%i==0){
                if(i == N/i){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        System.out.print(count);
    }
}
