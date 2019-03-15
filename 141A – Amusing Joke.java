import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Yehia Ezzat
 */
public class AmusingJoke {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine().toLowerCase();
        String input2 = scan.nextLine().toLowerCase();
        String input3 = scan.nextLine().toLowerCase();
 
        String resultOfOneAndTwo=input1+input2;
        char[] resultArray = resultOfOneAndTwo.toCharArray();
        Arrays.sort(resultArray);
        String sortedResult=String.valueOf(resultArray);
 
        char [] inputChar = input3.toCharArray();
        Arrays.sort(inputChar);
        String input3Sorted= String.valueOf(inputChar);
 
        if(input3Sorted.equals(sortedResult))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
