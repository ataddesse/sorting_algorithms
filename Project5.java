import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;


public class Project5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");

        File file = new File("C:\\Users\\amanu\\Lab5\\src\\Word List-1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
ArrayList<String> input = new ArrayList<>();
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("cbb");
        input1.add("abb");
        input1.add("aab");
        input1.add("bbb");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("cbb");
        input2.add("abb");
        input2.add("aab");
        input2.add("bbb");
        String st;
        while ((st = br.readLine()) != null){
            input.add(st);
          }


/*
        SelectionSort aa = new SelectionSort(input);
        aa.sort();
        //aa.printer();
        InsertionSort ab = new InsertionSort(input);
        long startTime1 = System.currentTimeMillis();
        ab.insertSort();
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;
        System.out.println(duration1);
        ab.printer();/*
        QuickSort cb = new QuickSort(input);
        long startTime1 = System.currentTimeMillis();
        cb.sort();
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;
        System.out.println(duration1);
        cb.printter();*/

        Heapsort dd = new Heapsort(input);
        dd.sort();
        System.out.println();
       // dd.printer();

        /*

        MergeSort ff = new MergeSort(input1);
        long startTime = System.nanoTime();
        ff.sort();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration);
        ff.printer();
*/



        System.out.println("ALGORITHM          |      Comparisons          | Time (Milliseconds                 ");
        System.out.println("===================+===========================+====================================");
        System.out.println("SelectionSort      | Comparisons               | Time (Milliseconds                 ");
        System.out.println("-------------------+---------------------------+------------------------------------");
        System.out.println("InsertionSort      | Comparisons               | Time (Milliseconds                 ");
        System.out.println("-------------------+---------------------------+------------------------------------");
        System.out.println("QuickSort          | Comparisons               | Time (Milliseconds                 ");
        System.out.println("-------------------+---------------------------+------------------------------------");
        System.out.println("MergeSort          | Comparisons               | Time (Milliseconds                 ");
        System.out.println("-------------------+---------------------------+------------------------------------");
        System.out.println("HeapSort           | Comparisons               | Time (Milliseconds)                ");
        System.out.println("-------------------+---------------------------+------------------------------------");


    }




}
