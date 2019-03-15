    import java.util.Scanner;
     
    /**
     *
     * @author Yehia Ezzat
     */
    public class BrainsPhoto {
     
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    String current = scan.next();
                    if (current.charAt(0) == 'C' || current.charAt(0) == 'M'
                            || current.charAt(0) == 'Y') {
                        System.out.println("#Color");
                        System.exit(0);
                    }
                }
            }
            System.out.println("#Black&White");
        }
    }
