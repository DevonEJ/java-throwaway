import java.util.Arrays;

public class InsertionSort {

    static void Sort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            // initialise variable to maintain position in array
            int j = i;
            // set starting array value
            int key = input[i];
            
            // while there are unsorted values left in array, and the value to the left of j is larger than it
            while (j > 0 && key < input[j - 1]) {
                // switch position of value to left of j with j
                input[j] = input[j - 1];
                // decrement j to move along to next value
                j--;
            }
            // place now sorted value in position
            input[j] = key;
        }
    }




    public static void main(String[] args) {

        int[] inputArr = {45, 77, 2, 34, 100, 4, 1, 0};

        Sort(inputArr);

        System.out.println(Arrays.toString(inputArr));
    }
}