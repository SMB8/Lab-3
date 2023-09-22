import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] intArray = new int[]{10,9,8,7,6,5,4,3,2,1}; // allocating memory to array

        selectionSort(intArray);
        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
    public static void sort(int[] intArray){
        selectionSort(intArray);
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }

            array[i + 1] = key;
        }
    }
    
    public static void selectionSort(int[] list){
        int n = list.length;
    
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min_idx])
                    min_idx = j;
            }
    
            // Swap the found minimum element with the first
            // element
            int temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        }
     }
}