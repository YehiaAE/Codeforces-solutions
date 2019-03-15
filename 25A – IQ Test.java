import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class IQtest {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int total = scan.nextInt();
       int number;
       int indexEven=0;
       int indexOdd=0;
       int counter=0;
       for(int i=1;i<=total;i++){
           number= scan.nextInt();    
           if(number%2==0){
               counter++;
               indexEven=i;      
           }
           else{
               counter--;
               indexOdd=i;
           }  
       }
       if(counter<0)
           System.out.print(indexEven);
       else
           System.out.print(indexOdd);       
    }  
}
