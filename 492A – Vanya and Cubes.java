import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class VanyaAndCubes {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cubes = scan.nextInt();
        int sum=0;
        int temp=0;
        int lvls=0;
        for(int i=1;;i++){
            sum+=i;
            temp+=sum;
            if(temp>cubes)
                break;
            lvls++;
        }
        System.out.println(lvls);
    }
}
