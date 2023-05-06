// Q1->  n=5;
// print= 5,4,3,2,1 using recursion
package Recursion;

class recursion1{
    public static void main(String[] args){
        recure(5);
    }
    static void recure (int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        recure(n-1);
    }


}