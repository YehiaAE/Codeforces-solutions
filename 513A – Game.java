import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class Game {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int k1=  scan.nextInt();
        int k2 = scan.nextInt();
        System.out.println(n1>n2 ? "First" : "Second");
    }  
}
