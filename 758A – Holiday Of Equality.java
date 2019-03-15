    import java.util.Scanner;
     
    /**
     *
     * @author Yehia Ezzat
     */
    public class HolidayOfEquality {
     
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int testCases = scan.nextInt();
            int[] input = new int[testCases];
            int max = 0, counter = 0;
            for (int i = 0; i < testCases; i++) {
                input[i] = scan.nextInt();
                if (input[i] > max) {
                    max = input[i];
                }
            }
            for (int i = 0; i < testCases; i++) {
                if (input[i] < max) {
                    counter += max - input[i];
                }
            }
            System.out.println(counter);
        }
    }
