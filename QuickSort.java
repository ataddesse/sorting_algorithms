import java.util.ArrayList;

public class QuickSort {

    private static ArrayList<String> inputArray = new ArrayList<String>();

    public QuickSort(ArrayList<String> input){
        inputArray = input;
    }

    public static int partition(ArrayList<String> stringArray, int idx1, int idx2) {
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
        }
        return idx1;
    }
    public static void QuicksortString(ArrayList<String> stringArray, int idx1, int idx2) {
        if (idx1 >= idx2) {
            // we are done
            return;
        }
        int pivotIndex = partition(stringArray, idx1, idx2);
        QuicksortString(stringArray, idx1, pivotIndex);
        QuicksortString(stringArray, pivotIndex+1, idx2);
    }
    public static void sort() {
        QuicksortString(inputArray, 0, inputArray.size() - 1);
    }


    public void printter(){
        System.out.println(inputArray.get(0));
        System.out.println(inputArray.get(1));
        System.out.println(inputArray.get(2));
        System.out.println(inputArray.get(3));
    }
}
