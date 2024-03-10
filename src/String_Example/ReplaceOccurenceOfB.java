package String_Example;

public class ReplaceOccurenceOfB {
    public static void main(String[] args){
        String str = "anil bhatia";
        char B = 'a';
        String ans = "";
        int len = str.length();
        for(int i =0; i<len;i++){
            char ch = str.charAt(i);
            if(ch == B){
               ans = ans + "@";
            } else {
                ans = ans + ch;
            }
        }
        System.out.print(ans);
    }
}
