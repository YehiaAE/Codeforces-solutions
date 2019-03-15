import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class MishkaAndGame {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rounds = scan.nextInt();
        int mishka = 0, chris = 0, draw = 0;
        for (int i = 0; i < rounds; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > y) {
                mishka++;
            } else if (y > x) {
                chris++;
            } else {
                draw++;
            }
        }
        if (mishka == chris) {
            System.out.println("Friendship is magic!^^");
        } else if ((mishka > chris && mishka > draw) || (mishka >= rounds - draw)) {
            System.out.println("Mishka");
        } else if (chris > mishka && chris > draw || (chris >= rounds - draw)) {
            System.out.println("Chris");
        } else {
            System.out.println();
        }
    }
}
