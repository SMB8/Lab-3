import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] intArray = new int[]{10,9,8,7,6,5,4,3,2,1}; // allocating memory to array

        
        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));
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
    
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            
            for(int j=i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                currentMin = list[j];
                currentMinIndex = j;
                }
            }
            
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
    
        }

    }
}