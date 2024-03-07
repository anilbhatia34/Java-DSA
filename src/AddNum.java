import java.util.Scanner;

public class AddNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // let's take one Variable to store the sum
        int sum =0;
        System.out.println("Please Enter the First Number");
        int first = sc.nextInt();
        System.out.println("Please Enter the Second Number");
        int second = sc.nextInt();
        //sum first and second
        sum = first+second;
        System.out.println("Sum of two number is : " + sum);
    }
}
