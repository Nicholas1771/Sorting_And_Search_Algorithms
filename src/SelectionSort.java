import java.util.ArrayList;

public class SelectionSort extends Sort implements CanSort {
    @Override
    public int[] sort(int[] numbersToSort) {
        int numNumbers = numbersToSort.length;
        int[] sortedNumbers = new int[numNumbers];
        ArrayList<Integer> unsortedNumbers = new ArrayList<Integer>(convertToList(numbersToSort));

        for (int i = 0; i < numNumbers; i++) {
            int lowestValueIndex = 0;
            for (int ii = 1; ii < unsortedNumbers.size(); ii++) {
                if (unsortedNumbers.get(ii) < unsortedNumbers.get(lowestValueIndex)) {
                    lowestValueIndex = ii;
                }
            }
            sortedNumbers[i] = unsortedNumbers.get(lowestValueIndex);
            unsortedNumbers.remove(lowestValueIndex);
        }

        if (!isSorted(sortedNumbers)) {
            System.out.println("ERROR: Selection Sort Failed");
        }

        return sortedNumbers;
    }

    private ArrayList<Integer> convertToList (int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        return arrList;
    }
}
