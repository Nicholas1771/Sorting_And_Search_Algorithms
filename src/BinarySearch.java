public class BinarySearch implements CanSearch {

    public BinarySearch () {}

    @Override
    public boolean search(int num, int[] arr) {
        int lowerIndex = 0;
        int upperIndex = arr.length-1;
        int splitIndex;
        boolean done = false;

        while (!done) {
            splitIndex = (upperIndex + lowerIndex) / 2;

            if (arr[splitIndex] < num) {
                lowerIndex = splitIndex;
            } else if (arr[splitIndex] > num) {
                upperIndex = splitIndex;
            } else {
                return true;
            }

            if (upperIndex == lowerIndex) {
                done = true;
            }
        }
        return false;
    }
}
