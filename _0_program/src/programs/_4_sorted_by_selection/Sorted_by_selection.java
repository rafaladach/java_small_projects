package programs._4_sorted_by_selection;

import java.util.Arrays;
import java.util.Random;

public class Sorted_by_selection {
    public static void main(String[] args) {

        Random generator = new Random();

        long start = System.currentTimeMillis();

        int[] myArray = new int[15];
        //created array with random numbers.
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = generator.nextInt(1,1000);
        }
        System.out.println("Array before sorting: " + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("Array after sorting: " + Arrays.toString(myArray));

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Czas trwania sortowania to: " + timeElapsed);
    }
}