import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Heapsort {
    ArrayList<String> source;
    // Used for index in heap
    int x = -1;
    int n = 0;
    int 
    // Predefining the heap array
    static String []heap = new String[10000];

    public Heapsort(ArrayList<String> input){
        source = new ArrayList<>(input);
        n = source.size();
    }

    // Defining formation of the heap
     void heapForm(String k)
    {
        x++;

        heap[x] = k;

        int child = x;

        String tmp;

        int index = x / 2;

        // Iterative heapiFy
        while (index >= 0)
        {

            // Just swapping if the element
            // is smaller than already
            // stored element
            if (heap[index].compareTo(heap[child]) > 0)
            {

                // Swapping the current index
                // with its child
                tmp = heap[index];
                heap[index] = heap[child];
                heap[child] = tmp;
                child = index;

                // Moving upward in the
                // heap
                index = index / 2;
            }
            else
            {
                break;
            }
        }
    }

    // Defining heap sort
     void heapSort()
    {
        int left1, right1;

        while (x >= 0)
        {
            String k;
            k = heap[0];

            // Taking output of
            // the minimum element
            System.out.print(k + " ");

            // Set first element
            // as a last one
            heap[0] = heap[x];

            // Decrement of the
            // size of the string
            x = x - 1;

            String tmp;

            int index = 0;

            int length = x;

            // Initilizing the left
            // and right index
            left1 = 1;

            right1 = left1 + 1;

            while (left1 <= length)
            {

                // Process of heap sort
                // If root element is
                // minimum than its both
                // of the child then break
                if (heap[index].compareTo(heap[left1]) <= 0 &&
                        heap[index].compareTo(heap[right1]) <= 0)
                {
                    break;
                }

                // Otherwise checking that
                // the child which one is
                // smaller, swap them with
                // parent element
                else
                {

                    // Swapping
                    if (heap[left1].compareTo(heap[right1])< 0)
                    {
                        tmp = heap[index];
                        heap[index] = heap[left1];
                        heap[left1] = tmp;
                        index = left1;
                    }

                    else
                    {
                        tmp = heap[index];
                        heap[index] = heap[right1];
                        heap[right1] = tmp;
                        index = right1;
                    }
                }

                // Changing the left index
                // and right index
                left1 = 2 * left1;
                right1 = left1 + 1;
            }
        }
    }

    // Utility function
   void sort_tobeWrapped(String k[], int n)
    {

        // To heapiFy
        for (int i = 0; i < n; i++)
        { heapForm(k[i]);
        }

        // Calling heap sort function
        heapSort();
    }

    void sort(){
        String arr[] = source.toArray(new String[source.size()]);
        sort_tobeWrapped(arr, n);
    }





}
