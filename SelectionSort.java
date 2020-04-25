import java.util.ArrayList;

public class SelectionSort {
    ArrayList<String> values;
    int counter = 0;

    public SelectionSort(ArrayList<String> input){

        values = new ArrayList<>(input);
    }


    public void sort() {
        for (int headIndex = 0; headIndex < values.size(); headIndex++) {
            sortFrom(headIndex);
        }
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
            String value = values.get(j);
            if (value.compareTo(smallest) < 0) {
                counter++; 
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

    public void printer(){
        for(int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }

    }
}
