package String_Example;

public class LowerCaseAndUpperCaseCount {
    public static void main(String[] args){

        String str = " ANil BhaTia";
        int lCount =0;
        int UCount =0;

        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                lCount++;
            } else if (ch>='A' && ch<='Z') {
                UCount++;
            }
        }
        System.out.println("lower Count : " +lCount);
        System.out.println("Upper Count : " +UCount);
    }
}
