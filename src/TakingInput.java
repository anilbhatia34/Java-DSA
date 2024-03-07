import java.util.Scanner;
public class TakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // for taking string input we will use  sc.next() only ,
        // for taking whole sentence as input then we will use nextLine();
        System.out.println("Please Enter the Value");
        int val = sc.nextInt();
        System.out.println("You have Entered : " + val);
    }
}
