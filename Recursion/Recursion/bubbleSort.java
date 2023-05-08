package Recursion;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={9,11,2,7,23,1,5};
     sort(arr,arr.length-1,0);
     System.out.println(Arrays.toString(arr));
        
    }
static void sort(int[] arr,int end ,int start){
    if(end==0){
        return;
    }
    if(start<end){
        if(arr[start]>arr[start+1]){
            int temp=arr[start];
            arr[start]=arr[start+1];
            arr[start+1]=temp;
        }
        sort(arr, end, start+1);
    }
    else{
        sort(arr, end-1, 0);
    }
}
}
