import java.util.Arrays;

public class Odd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Example input array
        System.out.println(Arrays.toString(arr));
        
        // Swap odd and even numbers
        swapOddEvenPositions(arr);
        
        System.out.println("Array after swapping odd and even positions: " + Arrays.toString(arr));
    }

    public static void swapOddEvenPositions(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if one is odd and the other is even
            if ((arr[i] % 2 == 1 && arr[i + 1] % 2 == 0) || (arr[i] % 2 == 0 && arr[i + 1] % 2 == 1)) {
                // Swap the two numbers
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
