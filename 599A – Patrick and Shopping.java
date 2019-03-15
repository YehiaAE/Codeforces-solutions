    import java.util.Arrays;
    import java.util.Scanner;
    /**
     *
     * @author Yehia Ezzat
     */
    public class PatrickAndShopping {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            int[] array = {x, y, z};
            Arrays.sort(array);
            System.out.println(Math.min(array[0] * 2 + array[1] * 2, array[0] + array[1] + array[2]));
        }
    }
