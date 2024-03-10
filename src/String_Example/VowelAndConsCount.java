package String_Example;
import java.util.Scanner;
public class VowelAndConsCount {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int T = scn.nextInt();
            scn.nextLine(); // Consume the newline character after nextInt

            while (T-- > 0) {
                String str = scn.nextLine();
                int vowelCount = 0;
                int consonantCount = 0;

                for (int i = 0; i < str.length(); i++) {
                    char ch = Character.toLowerCase(str.charAt(i));
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else if (Character.isLetter(ch)) {
                        consonantCount++;
                    }
                }

                System.out.println(vowelCount + " " + consonantCount);
            }
        }
}
