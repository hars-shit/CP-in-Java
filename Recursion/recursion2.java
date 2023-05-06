// Q2=> enter a number n and print each number from 1 to a termination point 
//  till the termination point 
// if n=10 print 1,2,3,4,5,6,7,8,9,10

package Recursion;

public class recursion2 {
    public static void main(String[] args) {
    print(1);    
    }
    static void print(int n){
        if(n==10){
            return ;
        }
        System.out.println(n);
        print(n+1);
    }

}
