import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class AAndBAndChess {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] input = new char[8][8];
        int a=0,b=0;
 
        for (int i = 0; i < 8; i++) {
            String s = scan.nextLine();
            input[i] = s.toCharArray();
        }
 
        for (int i = 0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                char test = input[i][j];
                if(Character.isUpperCase(test)){
                    if(test=='Q')
                        a+=9;
                    else if(test=='R')
                        a+=5;
                    else if(test=='B')
                        a+=3;
                    else if(test=='N')
                        a+=3;
                    else if(test=='P')
                        a+=1;
                    else a+=0;
                }
                else{
                    if(test=='q')
                        b+=9;
                    else if(test=='r')
                        b+=5;
                    else if(test=='b')
                        b+=3;
                    else if(test=='n')
                        b+=3;
                    else if(test=='p')
                        b+=1;
                    else
                        b+=0;
                }
            }
        }
        if(a>b)
            System.out.println("White");
        else if(b>a)
            System.out.println("Black");
        else
            System.out.println("Draw");
    }
}
