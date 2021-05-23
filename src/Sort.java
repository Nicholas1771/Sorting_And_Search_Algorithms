// This class holds a static method for checking if an array is sorted in numerical order from least to greatest
public class Sort {
    public static boolean isSorted(int[] arr) {
        //loop through the whole array, checking each value against the next value
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                //return false if a sequence of two numbers is in incorrect order
                return false;
            }
        }
        //array is sorted, return true
        return true;
    }
}
