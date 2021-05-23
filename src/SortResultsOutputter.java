import java.util.Arrays;

//Used to output sorting information to the user
public class SortResultsOutputter {

    //default constructor
    public SortResultsOutputter() {}

    //Print the results of the sort including the newly sorted array
    public void printResults(int[] results) {
        System.out.println("The list has been sorted:");
        System.out.println(Arrays.toString(results));
    }

    //Print the array unsorted for comparison against the sorted array
    public void printUnsorted(int[] unsorted) {
        System.out.println("The unsorted list is:");
        System.out.println(Arrays.toString(unsorted));
    }

}
