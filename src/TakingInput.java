import java.util.Scanner;
public class TakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Value");
        int val = sc.nextInt();
        System.out.println("You have Entered : " + val);
    }
}
