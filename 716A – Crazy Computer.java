import java.util.Scanner;
/**
 *
 * @author Yehia Ezzat
 */
public class CrazyComputer {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int[] input = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                counter++;
            } else {
                if (input[i] - input[i - 1] <= c) {
                    counter++;
                } else {
                    counter = 1;
                }
            }
 
        }
        System.out.println(counter);
    }
}
