import org.junit.Test;
import java.util.Arrays;

public class SortingArray {

    //sorting array in Ascending order
    int[] sortArrInAscendingOrder(int[] arr){

        if(arr==null || arr.length<3)
            return arr;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j])
                    swapArrNumbers(arr,i,j);
            }
        }
        return arr;
    }

    //sorting array in Descending order
    int[] sortArrInDescendingOrder(int[] arr){

        if(arr==null || arr.length<3)
            return arr;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j])
                    swapArrNumbers(arr,i,j);
            }
        }
        return arr;
    }

    //swaping array numbers
    void swapArrNumbers(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    @Test
    public void testAboveFunctions(){
        int[] arr = {1,-2,3,4,-5};

        sortArrInAscendingOrder(arr);
        System.out.println("ascending order : "+ Arrays.toString(arr));

        sortArrInDescendingOrder(arr);
        System.out.println("descending order : "+ Arrays.toString(arr));

    }


}
