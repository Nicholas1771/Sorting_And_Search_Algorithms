//Interface for sorting algorithms
public interface CanSort {
    //performs the sort on an int array
    int[] sort(int[] numbersToSort);
    //returns the string of the sorting algorithm, example: Merge Sort
    String getType();
}
