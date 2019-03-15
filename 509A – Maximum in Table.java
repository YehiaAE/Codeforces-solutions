import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class MaxiumumInTable {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) 
            array[0][i] = 1;
 
        for (int i = 0; i < size; i++) 
            array[i][0] = 1;
 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > 0 && j > 0) 
                    array[i][j] = array[i - 1][j] + array[i][j - 1];  
            }
        }  
        System.out.println(array[size-1][size-1]);
        }
}
