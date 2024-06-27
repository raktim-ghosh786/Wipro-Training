import java.util.*;
public class Assignment2 {

    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices");
        }
        
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        swap(intArray, 1, 3); // Swap elements at index 1 and 3
        System.out.println("After swapping: " + Arrays.toString(intArray));

        // Example with String array
        String[] strArray = {"apple", "orange", "banana", "grape"};
        System.out.println("\nOriginal String array: " + Arrays.toString(strArray));
        swap(strArray, 0, 2); // Swap elements at index 0 and 2
        System.out.println("After swapping: " + Arrays.toString(strArray));

        // Example with Double array
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5};
        System.out.println("\nOriginal Double array: " + Arrays.toString(doubleArray));
        swap(doubleArray, 1, 2); // Swap elements at index 1 and 2
        System.out.println("After swapping: " + Arrays.toString(doubleArray));

        // Example with custom class array
        Person[] personArray = {
            new Person("Aaryan", 25),
            new Person("Raktim", 30),
            new Person("Arush", 35)
        };
        System.out.println("\nOriginal Person array: " + Arrays.toString(personArray));
        swap(personArray, 0, 2); // Swap elements at index 0 and 2
        System.out.println("After swapping: " + Arrays.toString(personArray));
    }
   
}