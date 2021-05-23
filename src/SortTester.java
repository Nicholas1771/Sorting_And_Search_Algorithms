//Used to test various sorting algorithms including timing the sort, and printing the results
public class SortTester {

    //outputter used to display information to the user
    private SortResultsOutputter outputter;

    //constructor
    public SortTester () {
        outputter = new SortResultsOutputter();
    }

    //This is a method to test a specific sorter against and unsorted array, the results are printed
    public int[] testSort (int[] arr, CanSort sorter) {
        System.out.println("Testing: " + sorter.getType());
        outputter.printUnsorted(arr);
        //perform the sort and save results
        int[] sortResults = sorter.sort(arr);
        outputter.printResults(sortResults);
        return sortResults;
    }

    //This method performs the sort using a specific sorting algorithm as well as displays the time it took to sort.
    public int[] timeSort (int[] arr, CanSort sorter) {
        System.out.println("Timing: " + sorter.getType());
        //saves the starting time
        long startTime = System.nanoTime();
        //perform the sort
        int[] sortResults = sorter.sort(arr);
        //saves the ending time
        long endTime = System.nanoTime();
        //calculated nanoseconds elapsed
        long duration = (endTime - startTime);
        String timeScale = "nanoseconds";

        //Change to duration and time scale for easier readability and understanding by the user
        if (duration > 1000000000) {
            timeScale = "seconds";
            duration = duration / 1000000000L;
        } else if (duration > 1000000) {
            timeScale = "milliseconds";
            duration = duration / 1000000L;
        }

        //Output time elapsed
        System.out.println("Time: " + duration + " " + timeScale);
        return sortResults;
    }
}
