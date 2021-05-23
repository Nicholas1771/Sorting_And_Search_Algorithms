public class Main {

    RandomIntArrayGenerator generator;
    SortResultsOutputter outputter;
    CanSort mergeSort, selectionSort, bubbleSort;

    public Main() {
        generator  = new RandomIntArrayGenerator(1, 999);

        outputter = new SortResultsOutputter();

        mergeSort = new MergeSort();
        selectionSort = new SelectionSort();
        bubbleSort = new BubbleSort();

        int[] arr = generator.generate(1000);

        System.out.println("BUBBLE SORT");
        outputter.printUnsorted(arr);
        long startTime = System.nanoTime();
        int[] bubbleResults = bubbleSort.sort(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        outputter.printResults(bubbleResults);
        System.out.println("Time: " + duration);

        System.out.println();

        System.out.println("SELECTION SORT");
        outputter.printUnsorted(arr);
        startTime = System.nanoTime();
        int[] selectionResults = selectionSort.sort(arr);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        outputter.printResults(selectionResults);
        System.out.println("Time: " + duration);

        BinarySearch binarySearch = new BinarySearch();
        boolean searchResult = binarySearch.search(1, bubbleResults);
        System.out.println(searchResult ? "Found match" : "No match");

        //System.out.println("MERGE SORT");
        //outputter.printUnsorted(arr);
        //int[] mergeResults = selectionSort.sort(arr);
        //outputter.printResults(selectionResults);
    }

    public static void main(String[] args) {
        new Main();
    }
}
