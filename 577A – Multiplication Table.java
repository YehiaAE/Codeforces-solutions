import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class MultiplicationTable {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long rowsCols = scan.nextLong();
        long target = scan.nextLong();
        int cnt = 0;
        for (int i = 1; i <= rowsCols; i++) {
            if (target % i == 0 && target <= i * rowsCols) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
