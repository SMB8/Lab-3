import java.util.Arrays;
public class Sorter {
    public static void main(String[] args) throws Exception {

        int[] intArray = new int[]{10,9,8,7,6,5,4,3,2,1}; // allocating memory to array
        sort1(intArray);
        sort2(intArray); //This wont have any affect on the array, as it has been already sorted by the first sort (sort1)

        System.out.println(Arrays.toString(intArray));
    }

    public static void sort1(int[] intArray) {
        selectionSort(intArray);
    }

    public static void sort2(int array[]) {
        insertionSort(array);
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

    public static void selectionSort(int[] list) {
        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min_idx])
                    min_idx = j;

                int temp = list[min_idx];
                list[min_idx] = list[i];
                list[i] = temp;
            }
        }
    }
}