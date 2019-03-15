import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class CaseOfTheZerosAndOnes {
    private static Object CharMatcher;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        int ones=0,zeros=0;
        for(char c : input.toCharArray()){
            if(c=='1')
                ones++;
            if(c=='0')
                zeros++;
        }
        if(ones>=zeros)
            System.out.println(ones-zeros);
        else
            System.out.println(zeros-ones);
    } 
}
