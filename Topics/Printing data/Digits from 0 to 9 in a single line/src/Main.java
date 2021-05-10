import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        // put your code here
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        Arrays.sort(numbers, Collections.reverseOrder());
        for (int num : numbers) {
            System.out.print(num+" ");
        }
    }
}