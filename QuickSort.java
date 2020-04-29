import java.util.ArrayList;

public class QuickSort {
    // Our privatly initilaized inputArray
    private ArrayList<String> inputArray = new ArrayList<String>();
    private int counter = 0;
    private long start = 0;
    private long end = 0;
    private long duration = 0;
    // Constructor for this class
    public QuickSort(ArrayList<String> input){
        inputArray = new ArrayList<>(input);
    }

    //This method will handle the partitioning part of the quick sort algorithm
    public int partition(ArrayList<String> stringArray, int idx1, int idx2) {
        String pivotValue = stringArray.get(idx1);
        while (idx1 < idx2) {
            String value1;
            String value2;
            while ((value1 = stringArray.get(idx1)).compareTo( pivotValue ) < 0) {
                idx1 = idx1 + 1;
            }
            while ((value2 = stringArray.get(idx2)).compareTo( pivotValue ) > 0) {
                idx2 = idx2 - 1;
            }
            stringArray.set(idx1, value2);
            stringArray.set(idx2, value1);
            counter++;
        }
        return idx1;
    }


    //Our recursive method doing the sort by using a partition
    public void QuicksortString(ArrayList<String> stringArray, int idx1, int idx2) {
        start = System.currentTimeMillis();
        if (idx1 >= idx2) {
            // we are done
            return;
        }
        int pivotIndex = partition(stringArray, idx1, idx2);
        QuicksortString(stringArray, idx1, pivotIndex);
        QuicksortString(stringArray, pivotIndex+1, idx2);
        end = System.currentTimeMillis();
        duration = end - start;
    }

    public long duration(){
        return duration;
    }
    //Our wrapper classes
    public void sort() {
        QuicksortString(inputArray, 0, inputArray.size() - 1);
    }

    public int counter(){
        return counter;
    }

    public void printer(){
        for(int i=0; i<inputArray.size(); i++){

            System.out.println(inputArray.get(i));
        }
    }


}
