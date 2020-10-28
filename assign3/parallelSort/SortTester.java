package parallelSort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.logging.*;

/**
 *
 * @author Mirna Elizondo
 */
public class SortTester {
    /**
     * Calls runSortTester in order to create a random array to test the parallel
     * merge sorter
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        runSortTester();
        Logger logger = Logger.getLogger(SortTester.class.getName());
        FileHandler fh = output();
        logger.addHandler(fh);
        logger.setLevel(Level.WARNING);
        logger.log(Level.WARNING, "No errors");
        
        
    }
    /**
     * Creates and controls the file and console output by logging errors if found.
     */
    private static FileHandler output(){
        FileHandler fh = null;
        try{
            //new filehandler that logs issues in the program
            fh = new FileHandler("Logging.log", true);
        }catch(IOException e){
            Logger.getLogger(SortTester.class.getName()).log(Level.WARNING, null, e);
        }catch(SecurityException e){
            Logger.getLogger(SortTester.class.getName()).log(Level.WARNING, null, e);
        }
        return fh;
    }
     /**
     * Creates a random array of 100000 in order to test the Parallel merge sorter.
     */
    public static void runSortTester() {
        int LENGTH = 100000;   // length of array to sort
        Integer[] a = createRandomArray(LENGTH);
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer d1, Integer d2) {
                return d1.compareTo(d2);
            }
        };

        // run the algorithm and time how long it takes to sort the elements
        long startTime = System.currentTimeMillis();
        ParallelMergeSorter.sort(a, comp);
        long endTime = System.currentTimeMillis();
        //check to see if the array is already sorted.
        if (!isSorted(a, comp)) {
            throw new RuntimeException("not sorted afterward: " + Arrays.toString(a));
        }
        //output if merge works
        System.out.printf("%10d elements  =>  %6d ms \n", LENGTH, endTime - startTime);

    }

    /**
     * Returns true if the given array is in sorted ascending order.
     *
     * @param a the array to examine
     * @param comp the comparator to compare array elements
     * @return true if the given array is sorted, false otherwise
     */
    public static <E> boolean isSorted(E[] a, Comparator<? super E> comp) {
        for (int i = 0; i < a.length - 1; i++) {
            if (comp.compare(a[i], a[i + 1]) > 0) {
                System.out.println(a[i] + " > " + a[i + 1]);
                return false;
            }
        }
        return true;
    }

    // Randomly rearranges the elements of the given array.
    public static <E> void shuffle(E[] a) {
        for (int i = 0; i < a.length; i++) {
            // move element i to a random index in [i .. length-1]
            int randomIndex = (int) (Math.random() * a.length - i);
            swap(a, i, i + randomIndex);
        }
    }

    // Swaps the values at the two given indexes in the given array.
    public static final <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    // Creates an array of the given length, fills it with random
    // non-negative integers, and returns it.
    public static Integer[] createRandomArray(int length) {
        Integer[] a = new Integer[length];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(1000000);
        }
        return a;
    }

}
