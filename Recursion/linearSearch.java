package Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,12,6,31,77};
        search(arr,6,0);
        System.out.println(list);
    }
    // created a arraylist if the same key is in multiple index 
    static ArrayList<Integer> list=new ArrayList<>();
    static void search(int [] arr,int key,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==key){
                list.add(index);
        }
         search(arr, key, index+1);

    }
}
