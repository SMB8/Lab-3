import java.util.Arrays;
public class Sorter {
    public static void main(String[] args) throws Exception {
        double [] list = {5,6,2,1,3,7};

        selectionSort(list);
        System.out.println(Arrays.toString(list));
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