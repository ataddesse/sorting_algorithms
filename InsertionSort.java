import java.util.ArrayList;

public class InsertionSort {
    ArrayList<String> source;
    int counter = 0;

    public InsertionSort(ArrayList<String> input){
        source = new ArrayList<>(input);
    }
    // insertion sort for ArrayList
    public void insertSort(){
        long start221 = System.currentTimeMillis();
        int index = 1;

        while (index < source.size()){
            insertSorted((String)(source.get(index)), source, index);
            index = index + 1;
        }
        long start21 = System.currentTimeMillis();
        System.out.println(start221-start21);
    }

    // insert the given (City) object into the given list
    // assuming elements 0 through index - 1 are sorted
    // use comp for comparison
    public void insertSorted(String s, ArrayList<String> source, int index){
        int loc = index - 1;
        while ((loc >= 0) &&
                // c is smaller that the next highest element
                (s.compareTo(source.get(loc)) <= 0)){
            counter++;
            // move element to the right
            source.set(loc + 1, source.get(loc));
            loc = loc - 1;
        }
        source.set(loc+1, s);

    }

    public void printer(){
        System.out.println(source.get(0));
        System.out.println(source.get(1));
        System.out.println(source.get(2));
        System.out.println(source.get(3));
    }
}
