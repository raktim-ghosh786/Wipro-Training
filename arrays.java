public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 0-4 (5 elements)
        arr[0] = 5;
        arr[1] = 12;
        arr[2] = 18;
        arr[3] = 0;
        arr[4] = 12;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 12) {
                arr[i] = 42;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}