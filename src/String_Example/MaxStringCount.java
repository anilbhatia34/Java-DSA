package String_Example;

public class MaxStringCount {
    public static void main(String[] args){
        String str = "Hello MY Name Is ANI";
        int len = str.length();
        int Clen = 0;
        int OMax =0;
        for(int i =0; i<len; i++){
            if(str.charAt(i) == ' '){
                OMax = Math.max(OMax,Clen);
                Clen =0;
            }else {
                Clen++;
            }
        }
        OMax = Math.max(OMax,Clen);
        System.out.println(OMax);
    }
}
