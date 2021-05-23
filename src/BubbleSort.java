public class BubbleSort extends Sort implements CanSort {

    public BubbleSort() {
        super();
    }

    @Override
    public int[] sort (int[] numbersToSort) {
        int[] unsortedArr = numbersToSort.clone();
        while (!isSorted(unsortedArr)) {
            unsortedArr = performPassthrough(unsortedArr);
        }
        return unsortedArr;
    }

    private int[] performPassthrough (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
}
