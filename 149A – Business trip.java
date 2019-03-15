import java.util.Arrays;
import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class Businesstrip {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        if(k==0){
            System.out.println(0);
            System.exit(0);
        }
        int [] inputs = new int[12];
        int i,sum=0,cnt=0;
        for(i=0;i<12;i++){
           inputs[i]=scan.nextInt();
        }
        Arrays.sort(inputs);
        int flag=0;
        for(i=inputs.length-1;i>=0;i--){
            sum+=inputs[i];
            cnt++;
            if(sum>=k){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(-1);
        else
            System.out.println(cnt);
    }   
}
