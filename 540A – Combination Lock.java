    import java.util.Scanner;
    /**
     *
     * @author Yehia Ezzat
     */
    public class CombinationLock {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            scan.nextLine();
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            int i, result = 0;
            for (i = 0; i < size; i++) {
                int x = Integer.parseInt(Character.toString(s1.charAt(i)));
                int y = Integer.parseInt(Character.toString(s2.charAt(i)));
                result += Math.min(Math.abs(x - y), 10 - Math.abs(x - y));
            }
            System.out.println(result);
        }
    }
