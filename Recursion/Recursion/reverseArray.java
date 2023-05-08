package Recursion;

public class reverseArray {
    public static void main(String[] args) {
        String[] arr={"a","b","c","d"};
        reverse(arr,0,arr.length-1);
    }
    static void reverse(String[] arr,int start,int end){
       if(start>=end){
        return;
       }
       String temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr, start+1, end-1);
       System.out.println(arr);
    }
}
