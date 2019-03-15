import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class DouubleCola {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int input = scan.nextInt();
        int x=1;
        if(input<=5)
            System.out.println(names[input-1]);
        else{
            while(x*5<input){
                input-=x*5;
                x*=2;
            }
            System.out.println(names[(input-1)/x]);
        }   
    }  
}
