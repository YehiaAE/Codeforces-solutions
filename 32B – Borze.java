    import java.util.Scanner;
     
    /**
     *
     * @author Yehia Ezzat
     */
    public class Borze {
     
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char[] input = scan.nextLine().toCharArray();
            int i = 0;
            String result = "";
            while (i < input.length) {
                if (input[i] == '.') {
                    result += "0";
                } else if (input[i] == '-' && input[i + 1] == '.') {
                    result += "1";
                    i++;
                } else if (input[i] == '-' && input[i + 1] == '-') {
                    result += "2";
                    i++;
                }
                i++;
            }
            System.out.println(result);
        }
    }
