package Recursion;

public class recursion5 {
    public static void main(String[] args) {
        operator(6);
    }
    static void operator(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
         operator(--n);
    }
}
