public class stringex {
    public static void main() {
        String str = "Aaryan, Naveen, Arush, Ananya";

        String[] arr = str.split(", ");
        for (String s : arr) { // for-each loop
            System.out.println(s);
        }
        String str1 = "aaRyaN"; // uppercase
        String str2 = "AaryAn"; // lowercase

        System.out.println(str.trim());
        System.out.println(str2.charAt(str2.length() - 1));

        char[] ch = str2.toCharArray();
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

         if(str1.equalsIgnoreCase(str2)) {
            System.out.println("both string are equal");
        } else {
            System.out.println("both string are not equal");
        } 
    }
}
