import java.util.ArrayList;

//This class implements the CanSort interface using the selection sort algorithm
public class SelectionSort implements CanSort {

    //The type is "Selection Sort" used by the outputter class
    private String type;

    //constructor
    public SelectionSort() {this.type = "Selection Sort";}

    //This method contains the selection sorting algorithm
    @Override
    public int[] sort(int[] numbersToSort) {
        //get length of array
        int numNumbers = numbersToSort.length;
        //create empty array of equal size to the given array
        int[] sortedNumbers = new int[numNumbers];
        //convert given array to arraylist to easily remove elements that have been sorted
        ArrayList<Integer> unsortedNumbers = new ArrayList<>(convertToList(numbersToSort));

        //loops enough times to completely fill the sorted array
        for (int i = 0; i < numNumbers; i++) {
            //saves the index of the lowest value
            int lowestValueIndex = 0;

            //loops through the given arraylist searching for the lowest value index
            for (int ii = 1; ii < unsortedNumbers.size(); ii++) {
                //if a number is found to be the new lowest, save the index
                if (unsortedNumbers.get(ii) < unsortedNumbers.get(lowestValueIndex)) {
                    lowestValueIndex = ii;
                }
            }
            //lowest number was found, remove it from the arraylist and add it to the sorted array
            sortedNumbers[i] = unsortedNumbers.get(lowestValueIndex);
            unsortedNumbers.remove(lowestValueIndex);
        }

        //perform a check at the end to see if the sorting was successful
        if (!Sort.isSorted(sortedNumbers)) {
            System.out.println("ERROR: Selection Sort Failed");
        }

        return sortedNumbers;
    }

    //helper method to convert an int array to an arraylist
    private ArrayList<Integer> convertToList (int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int j : arr) {
            arrList.add(j);
        }
        return arrList;
    }

    //get the type
    public String getType() {
        return this.type;
    }
}
