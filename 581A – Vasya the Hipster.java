import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class VasyatheHipster {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sarsagy = Math.min(a,b);
        if(a>b){
            System.out.print(sarsagy+" "+(a-b)/2);
        }
        else{
            System.out.print(sarsagy+" "+(b-a)/2);
        }
    }
}
