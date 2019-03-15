    import java.util.Arrays;
    import java.util.Scanner;
     
    /**
     *
     * @author Yehia Ezzat
     */
    public class MUHandSticks {
     
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] input = new int[6];
            for (int i = 0; i < 6; i++) {
                input[i] = scan.nextInt();
            }
            Arrays.sort(input);
            int leg = input[3];
            int x = 0, y = 0;
            int counter = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] == leg) {
                    counter++;
                } else if (x == 0) {
                    x = input[i];
                } else if (y == 0) {
                    y = input[i];
                }
            }
            if (counter < 4) {
                System.out.println("Alien");
                System.exit(0);
            } else {
                if (x != y) {
                    System.out.println("Bear");
                } else {
                    System.out.println("Elephant");
                }
            }
        }
    }
