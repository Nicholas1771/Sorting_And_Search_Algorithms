import java.util.ArrayList;

//This class is an implementation of the CanSort interface and uses the merge sort algorithm to sort arrays
public class MergeSort implements CanSort {

    //the type of the sorting algorithm
    private String type;

    //constructor
    public MergeSort(){this.type = "Merge Sort";}

    //this method performs the merge sort algorithm on a array of integers and returns the sorted array
    @Override
    public int[] sort(int[] numbersToSort) {
        //Converts the given array to a list of lists each containing a single number from the given array
        ArrayList<ArrayList<Integer>> sublists = getSublists (numbersToSort);

        //while we have more than 1 list, perform merge steps, each time halving the number of lists until we get to 1 fully sorted list
        while (sublists.size() != 1) {
            //perform merge step on sublists
            sublists = mergeStep(sublists);
        }

        //convert the sorted arraylist to an int array
        int[] resultArray = new int[sublists.get(0).size()];
        for (int i = 0; i < sublists.get(0).size(); i++) {
            resultArray[i] = sublists.get(0).get(i);
        }

        return resultArray;
    }

    //This method is used to convert an array of integers into an arraylist of arraylists with each containing one integer from the int array
    private ArrayList<ArrayList<Integer>> getSublists (int[] numbers) {

        //initialize the arraylist of arraylists
        ArrayList<ArrayList<Integer>> sublists = new ArrayList<>();

        //loop through the given int array and add each integer to a separate arraylist each, and add all those arraylists to sublists arraylist
        for (int number : numbers) {
            //creates the empty list for the integer to be added
            ArrayList<Integer> listToAdd = new ArrayList<>();
            //add the integer to the list, then add the list to sublists
            listToAdd.add(number);
            sublists.add(listToAdd);
        }
        //return the lists in correct format
        return sublists;
    }

    //This method performs a merge step on a list of lists of integers, this method returns a list of roughly half the length of the original
    private ArrayList<ArrayList<Integer>> mergeStep (ArrayList<ArrayList<Integer>> sublists) {
        //create the empty list of lists to be filled later
        ArrayList<ArrayList<Integer>> mergedSublists = new ArrayList<>();
        //loop until there is no more sublists to be merged
        while(sublists.size() > 0) {
            //if there is atleast two sublists, merge them together and add the merged list to mergedSublists to be returned
            if (sublists.size() > 1) {
                //merge and add the merged sublists to mergedSublists
                mergedSublists.add(mergeSublists(sublists.get(0), sublists.get(1)));
                //remove the two sublists that were merged together
                sublists.remove(0);
                sublists.remove(0);
            } else {
                //there is only one sublist remaining, simply add it to the end of the merged sublists
                mergedSublists.add(sublists.get(0));
                sublists.remove(0);
            }
        }
        return mergedSublists;
    }

    //This method is used to merge two sublists together, and returns the resulting arraylist of integers
    private ArrayList<Integer> mergeSublists (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //save the length of the final returned arraylist
        int resultLength = list1.size() + list2.size();
        //create the empty arraylist to be returned
        ArrayList<Integer> resultList = new ArrayList<>();

        //loop through the union of both sublists joined vertically
        for (int resultIndex = 0; resultIndex < resultLength; resultIndex++) {
            //if both lists have atleast one value left, compare them
            if (list1.size() > 0 && list2.size() > 0) {
                //If list1's number is smaller add that to the merged list and remove the value from list1
                if (list1.get(0) < list2.get(0)) {
                    resultList.add(list1.get(0));
                    list1.remove(0);
                } else if (list1.get(0) > list2.get(0)) {
                    //if list2's number is smaller add that to the merged list and remove the valur from list2
                    resultList.add(list2.get(0));
                    list2.remove(0);
                } else {
                    //both values are the same, add both to the merged list and remove both from each list
                    resultList.add(list1.get(0));
                    resultList.add(list2.get(0));
                    list1.remove(0);
                    list2.remove(0);
                }
            } else {
                //at least one of the two lists have no values left, simply fill both lists into the result merged list
                while (list1.size() != 0) {
                    resultList.add(list1.get(0));
                    list1.remove(0);
                }
                while (list2.size() != 0) {
                    resultList.add(list2.get(0));
                    list2.remove(0);
                }
            }
        }
        return resultList;
    }

    //return the type of the sorting algorithm
    public String getType(){
        return this.type;
    }
}
