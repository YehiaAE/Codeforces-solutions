    import java.util.Scanner;
    /**
     *
     * @author Yehia Ezzat
     */
    public class DreamoonAndStairs {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            int temp;
            if (n < m) {
                System.out.println(-1);
                System.exit(0);
            } else {
                if (n % 2 == 0) {
                    temp = n / 2;
                } else {
                    temp = (n / 2) + 1;
                }
                while (temp % m != 0) {
                    temp++;
                }
                System.out.println(temp);
            }
        }
    }
