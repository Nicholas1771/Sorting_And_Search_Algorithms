// this class implements the cansort interface using the bubble sort algorithm
public class BubbleSort implements CanSort {

    //type of the sorting algorithm
    private String type;

    //constructor
    public BubbleSort() {this.type = "Bubble Sort";}

    //This method implements the bubble sort algorithm
    @Override
    public int[] sort (int[] numbersToSort) {
        //clones the given integer array
        int[] unsortedArr = numbersToSort.clone();
        //while the array is still unsorted, keep performing pass throughs
        while (!Sort.isSorted(unsortedArr)) {
            //perform passthrough
            performPassthrough(unsortedArr);
        }
        //return sorted* array
        return unsortedArr;
    }

    //perform a passthrough of the int array, swapping two values if they are in incorrect order
    private int[] performPassthrough (int[] arr) {
        // loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // if two values are incorrectly ordered, flip them
            if (arr[i] > arr[i+1]) {
                //store temp value
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //return array after passthrough, array may not be sorted
        return arr;
    }

    //get the sorting algorithm type
    public String getType() {
        return this.type;
    }
}
