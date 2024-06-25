import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class streamex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(-1);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }

        list.stream().filter(e -> e % 2 != 0 && e > 0).forEach(System.out::println);

        int count = (int) list.stream().filter(e -> e % 2 == 0).count();
         System.out.println(count);
         boolean b = list.stream().anyMatch(e -> e % 2 == 0);
         System.out.println(b);
        
        // find all the odd numbers and then multiply all of them with 2
        list.stream().filter(e -> e % 2 != 0)
            .map(e -> e * 2).forEach(System.out::println);

      

         list.stream().sorted().forEach(System.out::println);
         Collections.sort(list);

       

    }
}