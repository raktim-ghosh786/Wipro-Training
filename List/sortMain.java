package List;
import java.util.*;

public class sortMain{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers :");

        
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break; 
            }
            list.add(num);
        }
        scanner.close();

        System.out.println("List of numbers entered:");
        System.out.println(list);

    
        ListSort ls = new ListSort();
        ls.bubbleSort(list);

        System.out.println("Sorted List: " + list);
    }
}