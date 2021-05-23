//This class implements the CanSearch interface using the binary search algorithm to search through a list of ints for a specific integer
public class BinarySearch implements CanSearch {

    //default constructor
    public BinarySearch () {}

    //implements the search method using the binary search algorithm
    @Override
    public boolean search(int num, int[] arr) {
        //tracks the lower index, upper index and split index
        int lowerIndex = 0;
        int upperIndex = arr.length-1;
        int splitIndex;
        //true if search is completed
        boolean done = false;

        //loop until search is completed
        while (!done) {
            //recalculate the split index, using the updated upper and lower indexes
            splitIndex = (upperIndex + lowerIndex) / 2;

            //if the target number is less than the number at split index, assign upperindex to split index, and visa versa
            if (arr[splitIndex] < num) {
                lowerIndex = splitIndex;
            } else if (arr[splitIndex] > num) {
                upperIndex = splitIndex;
            } else {
                //match has been found
                return true;
            }

            if (upperIndex == lowerIndex) {
                //limits converged, no match
                done = true;
            }
        }
        //no match was found
        return false;
    }
}
