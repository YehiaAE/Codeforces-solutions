import java.util.Scanner;
/**
 *
 * @author Yehia Ezzat
 */
public class AandBandCompilationErrors {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] initial = new int [n];
        int [] second = new int[n-1];
        int [] third = new int[n-2];
        int initialSum=0,secondSum=0,thirdSum=0;
        for(int i=0;i<n;i++){
            initial[i]= scan.nextInt();
            initialSum+=initial[i];
        }
        for(int i=0;i<second.length;i++){
            second[i]= scan.nextInt();
            secondSum+=second[i];
        }
        for(int i=0;i<third.length;i++){
            third[i]= scan.nextInt();
            thirdSum+=third[i];
        }
        System.out.println(initialSum-secondSum);
        System.out.println(secondSum-thirdSum);
    }
}
