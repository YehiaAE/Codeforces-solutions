    import java.util.Scanner;
    /**
     *
     * @author Yehia Ezzat
     */
    public class KefaAndFirstSteps {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] array = new int[size];
            int current=1,max=1,i=0;
            for(i=0;i<size;i++)
                array[i]=scan.nextInt();
            for(i=1;i<array.length;i++){
                if(array[i]>=array[i-1])
                    current++;
                else
                    current=1;
                max= Math.max(current,max);
            }
            System.out.println(max);
        }
    }
