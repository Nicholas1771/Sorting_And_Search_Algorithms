import java.util.Arrays;

public class SortResultsOutputter {

    public SortResultsOutputter() {}

    public void printResults(int[] results) {
        System.out.println("The list has been sorted:");
        System.out.println(Arrays.toString(results));
    }

    public void printUnsorted(int[] unsorted) {
        System.out.println("The unsorted list is:");
        System.out.println(Arrays.toString(unsorted));
    }

}
