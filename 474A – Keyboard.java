import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class Keyboard {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String direction = scan.nextLine();
        String input = scan.nextLine();
        String pattern = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String result = "";
 
        if (direction.charAt(0) == 'R') {
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (input.charAt(i) == pattern.charAt(j)) {
                        result += pattern.charAt(j - 1);
                    }
 
                }
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (input.charAt(i) == pattern.charAt(j)) {
                        result += pattern.charAt(j + 1);
                    }
                }      
            }
        }
        System.out.println(result);
    }
}
