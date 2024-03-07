import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // let take one variable which store the result of simpleIntrest

        System.out.println("Enter the Principle Amount");
        float p = sc.nextFloat();
        System.out.println("Enter the Intrest Rate");
        float r = sc.nextFloat();
        System.out.println("Enter the Time period ");
        float t = sc.nextFloat();
        float simpleIntrest = (p*r*t)/100;
        System.out.println("Simple Intrest is : " + simpleIntrest);
    }
}
