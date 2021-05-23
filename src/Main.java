public class Main {

    //Tester is used to perform various tests on the sorting algorithms
    SortTester tester;
    //generator is used to generate random int array
    RandomIntArrayGenerator generator;
    //Used to search and array for a numerical value
    BinarySearch binarySearch;
    //3 different sorting algorithms
    CanSort mergeSort, selectionSort, bubbleSort;

    // main constructor
    public Main() {
        //initialize the objects
        init();

        //generate an int array of 10000 random integers
        int[] arr = generator.generate(10000);

        //perform sorts on the array using all 3 methods and printing time results to compare efficiency
        int[] results = tester.timeSort(arr, mergeSort);
        tester.timeSort(arr, bubbleSort);
        tester.timeSort(arr, selectionSort);

        //using the sorted results, perform binary search for the number 1
        boolean searchResult = binarySearch.search(1, results);
        System.out.println(searchResult ? "Found match" : "No match");
    }

    //initialize the objects
    private void init() {
        tester = new SortTester();
        //set the generator to pick from 1 - 9999 inclusive
        generator  = new RandomIntArrayGenerator(1, 9999);

        mergeSort = new MergeSort();
        selectionSort = new SelectionSort();
        bubbleSort = new BubbleSort();

        binarySearch = new BinarySearch();
    }

    //main method
    public static void main(String[] args) {
        new Main();
    }
}
