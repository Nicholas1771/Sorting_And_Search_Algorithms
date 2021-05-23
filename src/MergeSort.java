public class MergeSort extends Sort implements CanSort {

    private int numItems = 0;

    public MergeSort(){
        super();
    }

    @Override
    public int[] sort(int[] numbersToSort) {
        numItems = numbersToSort.length;
        int[][] sublists = getSublists (numbersToSort);
        int[][] copy = sublists.clone();

        while (copy[0].length != numbersToSort.length) {
            for (int i = 0; i < copy.length; i += 2) {
            }
        }
        return numbersToSort;
    }

    private int[][] getSublists (int[] list) {

        int[][] sublists = new int[list.length][1];

        for (int i = 0; i < list.length; i++) {
            sublists[i] = new int[1];
            sublists[i][0] = list[i];
        }

        return sublists;
    }

    private int[][] mergeStep (int[][] sublists) {
        int numSublists = sublists.length;
        int numNewSublists = numSublists % 2 == 0 ? numSublists / 2 : numSublists / 2 + 1;
        int[][] mergedSublists = new int[numNewSublists][3];
        return sublists;
    }

    private int[] mergeSublists (int[] list1, int[] list2) {
        int resultLength = list1.length + list2.length;
        int[] resultList = new int[resultLength];

        int list1Index = 0;
        int list2Index = 0;

        for (int resultIndex = 0; resultIndex < resultLength; resultIndex++) {

            while (list1Index != list1.length && list2Index != list2.length) {
                int list1Num = list1[list1Index];
                int list2Num = list2[list2Index];
                if (list1Num < list2Num) {
                    resultList[resultIndex] = list1Num;
                    list1Index++;
                } else if (list2Num < list1Num) {
                    resultList[resultIndex] = list2Num;
                    list2Index++;
                } else {
                    resultList[resultIndex] = list1Num;
                    list1Index++;
                    resultIndex++;
                    resultList[resultIndex] = list2Num;
                    list2Index++;
                }
            }

            while (list1.length != list1Index) {
                resultList[resultIndex] = list1[list1Index];
                list1Index++;
                resultIndex++;
            }

            while (list2.length != list2Index) {
                resultList[resultIndex] = list2[list2Index];
                list2Index++;
                resultIndex++;
            }
        }
        return resultList;
    }
}
