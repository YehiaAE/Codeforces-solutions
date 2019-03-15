package quicksort;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
/**
 *
 * @author Yehia Ezzat
 */
 
public class QuickSort {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter your numbers:");       
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }
        Sort(numbers,0,numbers.size()-1);
 
        for (Integer number : numbers) {
            System.out.println(number);
        }    
    }
 
    public static void Sort(List<Integer> numbers,int start, int end) {
       if( start < end){
           int partitionIndex = partition(numbers,start,end);
           Sort(numbers,start,partitionIndex-1);
           Sort(numbers,partitionIndex+1,end);           
       }  
    }
 
    public static int partition(List<Integer> numbers,int start, int end) {
       int partition_index = start;
       int pivot=numbers.get(end);
       int temp1=0;
       int temp2=0;
 
       for(int i=start;i<end;i++){
           if(numbers.get(i)<=pivot){
               temp1=numbers.get(partition_index);
               numbers.set(partition_index, numbers.get(i));
               numbers.set( i, temp1 );    
               partition_index++;
           }
       }
       temp2=numbers.get(end);
       numbers.set(end, numbers.get(partition_index));
       numbers.set(partition_index,temp2);
       return partition_index;
    }
}
