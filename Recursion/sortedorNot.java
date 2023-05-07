// Q- Given array is sorted or not 

package Recursion;

public class sortedorNot {
    public static void main(String[] args) {
        int [] arr={2,34,16,121,671};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int [] arr ,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
} 
