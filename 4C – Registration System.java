import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class RegistrationSystem {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Map<String, Integer> dataBase = new HashMap<>();
       int testCases = scan.nextInt();
       scan.nextLine();
       for(int i=0;i<testCases;i++){
           String input = scan.nextLine();
           if(dataBase.containsKey(input)){
               int x = dataBase.get(input);
               x++;
               dataBase.put(input, x);
               System.out.println(input+x);
           }
           else{
               System.out.println("OK");
               dataBase.put(input,0);   
           }
       }
    }   
}
