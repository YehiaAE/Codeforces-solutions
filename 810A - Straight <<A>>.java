import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class StraightA {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        float x, avg = 0;
        float currentSum = 0;
        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            currentSum += x;
        }
        avg = Math.round(currentSum / n);
        int c = 0;
        while (avg < k) {
            n++;
            currentSum += k;
            avg = Math.round(currentSum / n);
            c++;
        }
        System.out.println(c);
    }
}
