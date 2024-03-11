package ProblemSolving;

public class CountFactors {
    public static void main(String[] args){
        int n = 24;
        int count =0;
        int OptimCount =0;
        //with Brute force : go upto all iteration till solution reach
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
        // Optimized Solution is :
        for(int i=1; i*i <=n ; i++){
            if(n%i==0){
                if(i== n/i){
                    OptimCount++;
                }else{
                    OptimCount += 2;
                }
            }
        }
        System.out.println(OptimCount);
    }
}
