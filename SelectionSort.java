import java.util.ArrayList;

public class SelectionSort {
    private ArrayList<String> values;
    private int counter = 0;
    private long start = 0;
    private long end = 0;
    private long duration  = 0;

    public SelectionSort(ArrayList<String> input){

        values = new ArrayList<>(input);
    }


    public void sort() {
        start = System.currentTimeMillis();
        for (int headIndex = 0; headIndex < values.size(); headIndex++) {
            sortFrom(headIndex);
        }
        end= System.currentTimeMillis();
duration  = end - start;
    }

    public void sortFrom(int headIndex) {
        int smallestIndex = findSmallestFrom(headIndex);
        if (smallestIndex != headIndex) {
            swap(headIndex, smallestIndex);
        }
    }

    public int findSmallestFrom(int i) {
        int smallestIndex = i;
        String smallest = values.get(i);
        for (int j = i; j < values.size(); j++) {
            counter++;
            String value = values.get(j);
            if (value.compareTo(smallest) < 0) {

                smallest = value;
                smallestIndex = j;
            }
        }

        return smallestIndex;
    }

    public int counter(){
        return counter;
    }

    public void swap(int i, int j) {
        String head = values.get(i);
        values.set(i, values.get(j));
        values.set(j, head);
    }

    public long duration(){
        return duration;

    }

}
