package ProblemSolving;

public class countAGPairOptimised {
    public static void main(String[] args){
        String s ="acgdgag";
        // This is optimized technique , in this we need to start fon n-1, i.e from
       //  last element ,and count the pair
        int ans =0;
        int N = s.length();
        int count =0;
        for(int i=N-1; i>=0; i--){
              if(s.charAt(i) == 'a'){
                  ans = ans + count;
              }else if(s.charAt(i)=='g'){
                  count++;
              }
        }
        System.out.println(ans);
    }
}
