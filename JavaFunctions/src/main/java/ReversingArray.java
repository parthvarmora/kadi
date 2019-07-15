import org.junit.Test;

import java.util.Arrays;

public class ReversingArray {

    int[] reversingArray(int[] arr){

        int[] arrHolder = new int[arr.length];
        int j=0;

        for(int i=arr.length-1;i>=0;i--){
            arrHolder[j]=arr[i];
            j++;
        }

        return arrHolder;
    }

    @Test
    public void testAboveMethod(){

        int[] arr ={1,2,3,4,5};
        System.out.println("original array: "+ Arrays.toString(arr));

        int[] arr1=reversingArray(arr);
        System.out.println("reversed array:"+Arrays.toString(arr1));

    }
}
