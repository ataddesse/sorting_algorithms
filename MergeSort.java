import java.util.ArrayList;

public class MergeSort {

    ArrayList<String> source;

    public MergeSort(ArrayList<String> input){
        source = new ArrayList<>(input);
    }
public void sort(){
        mergeSort(source, 0 , source.size()-1);
}

    public static void mergeSort(ArrayList<String> a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first and the second half
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }// end mergeSort
//work

    public static void merge(ArrayList<String> a, int from, int mid, int to) {
        int n = to - from + 1;       // size of the range to be merged
        String[] b = new String[n];   // merge both halves into a temporary array b
        int i1 = from;               // next element to consider in the first range
        int i2 = mid + 1;            // next element to consider in the second range
        int j = 0;                   // next open position in b

        // as long as neither i1 nor i2 past the end, move the smaller into b
        while (i1 <= mid && i2 <= to) {
            if (a.get(i1).compareTo(a.get(i2)) < 0) {
                b[j] = a.get(i1);
                i1++;
            } else {
                b[j] = a.get(i2);
                i2++;
            }
            j++;
        }

        // note that only one of the two while loops below is executed
        // copy any remaining entries of the first half
        while (i1 <= mid) {
            b[j] = a.get(i1);
            i1++;
            j++;
        }

        // copy any remaining entries of the second half
        while (i2 <= to) {
            b[j] = a.get(i2);
            i2++;
            j++;
        }

        // copy back from the temporary array
        for (j = 0; j < n; j++) {
            a.set((from + j), b[j]);
        }
    }//end merge


    public void printer(){
        System.out.println(source.get(0));
        System.out.println(source.get(1));
        System.out.println(source.get(2));
        System.out.println(source.get(3));
    }

}


