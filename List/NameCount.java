package List;

import java.util.*;

public class NameCount {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raktim","Arush","Aaryan","Avishek","Aaryan","Aaryan","Raktim","Aaryan");

        List<String> nameCount = new ArrayList<>();

        List<Integer> counts = new ArrayList<>();

        // Count occurrences of each name
        for (String name : names) {
            int i = nameCount.indexOf(name);
            if (i != -1) {
                counts.set(i, counts.get(i) + 1);
            } else {
                nameCount.add(name);
                counts.add(1);
            }
        }

        // Print the occurrences
        System.out.println("Occurrences of each name:");
        for (int i = 0; i < nameCount.size(); i++) {
            System.out.println(nameCount.get(i) + ": " + counts.get(i));
        }
    }
}