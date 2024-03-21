package ProblemSolving;

public class countAGPair {
    public static void main(String[] args){
        String s ="acgdgag";
        // Brute Force technique
        int count =0;
        int N = s.length();
        for(int i=0; i<N; i++){
            if(s.charAt(i) =='a'){
                for(int j = i+1; j<N; j++){
                    if(s.charAt(j) =='g'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
