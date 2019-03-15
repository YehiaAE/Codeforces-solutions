import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
public class TeamOlympiad {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] children = new int[number];
        List<Integer> places = new ArrayList<>();
        int c1 = 0, c2 = 0, c3 = 0;
        int initialSum = 0;
        for (int i = 0; i < number; i++) {
            children[i] = scan.nextInt();
            initialSum += children[i];
        }
        while (initialSum > 1) {
            for (int i = 0; i < children.length; i++) {
                if (children[i] == 1) {
                    c1++;
                    initialSum -= children[i];
                    children[i] -= children[i];
                    places.add(i + 1);
                    break;
                }
            }
            for (int i = 0; i < children.length; i++) {
                if (children[i] == 2) {
                    c2++;
                    initialSum -= children[i];
                    children[i] -= children[i];
                    places.add(i + 1);
                    break;
                }
            }
            for (int i = 0; i < children.length; i++) {
                if (children[i] == 3) {
                    c3++;
                    initialSum -= children[i];
                    children[i] -= children[i];
                    places.add(i + 1);
                    break;
                }
            }
        }
        if ((Math.min(c1,Math.min(c2,c3))) == 0){
            System.out.println(0);
        }
         else {
            System.out.println((Math.min(c1,Math.min(c2,c3))));
            for(int i = 0,j=1; i < (Math.min(c1,Math.min(c2,c3)))*3; i++) {
                System.out.print(places.get(i) + " ");
                if(j%3==0)
                    System.out.println();
                j++;
            }
        }
    }
}
