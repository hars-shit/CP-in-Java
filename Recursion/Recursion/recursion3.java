// Q3-> factorial of n using recursion

package Recursion;

public class recursion3 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
