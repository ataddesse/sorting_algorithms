import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;


public class Project5 {
    public static void main(String[] args) throws IOException {

       //Reading the file here
        File file = new File("C:\\Users\\amanu\\Lab5\\src\\Word List-1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> input = new ArrayList<>();

        //Putting all words to an ArrayList
        String st;

        while ((st = br.readLine()) != null) {

            input.add(st);

          }


// Creating an instance of the selection sort class here
        SelectionSort sortcheck1 = new SelectionSort(input);
        long startTime1 = System.currentTimeMillis();
        sortcheck1.sort();
        long endTime1 = System.currentTimeMillis();
        long duration1 = sortcheck1.duration();
       int selectionCounter = sortcheck1.counter();


// Creating an instance of the insertion sort class here
        InsertionSort sortcheck2 = new InsertionSort(input);
        long startTime2 = System.currentTimeMillis();
        sortcheck2.insertSort();
        long endTime2 = System.currentTimeMillis();
        long duration2 = sortcheck2.duration();
        int insertionCounter = sortcheck2.counter();


// Creating an instance of the quick sort class here
        QuickSort sortcheck3 = new QuickSort(input);
        long startTime3 = System.currentTimeMillis();
        sortcheck3.sort();
        long endTime3 = System.currentTimeMillis();
        long duration3 = sortcheck3.duration();
        int quickCounter = sortcheck3.counter();
        sortcheck3.printer();

// Creating an instance of the heap sort class here
        Heapsort sortcheck4 = new Heapsort(input);
        long startTime4 = System.currentTimeMillis();
        sortcheck4.sort();
        long endTime4 = System.currentTimeMillis();
        long duration4 = sortcheck4.duration();
        int heapcounter = sortcheck4.counter();


// Creating an instance of the merge sort class here
        MergeSort sortcheck5 = new MergeSort(input);
        long startTime5 = System.nanoTime();
        sortcheck5.sort();
        long endTime5 = System.nanoTime();
        long duration5 = sortcheck5.duration();
        int mergeCounter = sortcheck5.counter();




        System.out.println("ALGORITHM          |      Comparisons          |              Time (Milliseconds)                ");
        System.out.println("===================+===========================+====================================");
        System.out.println("Selection Sort     |  " +selectionCounter+"                  |"+ duration1);
        System.out.println("Insertion Sort     |  " +insertionCounter+"                  |"+ duration2);
        System.out.println("Quick Sort         |  " +quickCounter+"                    |"+ duration3);
        System.out.println("Heap Sort          |  " +heapcounter+"                     |"+ duration4);
        System.out.println("Merge Sort         |  " +mergeCounter+"                    |"+ duration5);

    }




}
