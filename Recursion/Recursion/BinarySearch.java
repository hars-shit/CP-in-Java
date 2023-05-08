package Recursion;



public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,9};
        int start=0;
        int end=arr.length-1;
       System.out.println( search(arr,start,end,9));
       
    }
    static int search(int[] arr,int start,int end,int key){
        
        int mid=start+(end-start)/2;
        if( arr[mid]< key ){
            return search(arr, mid+1, end, key);
        }
        else if(arr[mid]>key){
            return search(arr, start, mid-1, key);
        }
        else{
            return mid;
        }

    }
}
