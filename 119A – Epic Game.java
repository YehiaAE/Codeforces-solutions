import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class EpicGame {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int heap = scan.nextInt();
        while (true) {
            heap -= getGCD(n1, heap);
            if (heap == 0) {
                System.out.println(0);
                System.exit(0);
            }
            heap -= getGCD(n2, heap);
            if (heap == 0) {
                System.out.println(1);
                System.exit(0);
            }
        } 
    }
 
    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }   
}
