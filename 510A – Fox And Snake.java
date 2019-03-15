import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class FoxAndSnake {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
 
        int mark=0;
 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0)
                    System.out.print("#");
                else if(i%2==1 && mark==0){
                    if(j<m-1)
                        System.out.print(".");
                    else{
                        mark =1;
                        System.out.print("#");
                    }
                }
                else if(i%2==1 && mark==1){
                    if(j==0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                    if(j==m-1)
                        mark=0;
                }
            }
            System.out.println("");
        }
    }   
}
