package Recursion;

public class count_zero {

    public static void main(String[] args) {
        System.out.println(couter(100430));

    }
    static int couter(int n) {
        return helper(n, 0);
     }
    static int helper(int n,int zeros){
    if(n==0){
        return zeros;
    }    
    int rem=n%10;
   if(rem==0) {
        return helper(n/10, zeros+1);
    }
    return helper(n / 10, zeros);
    }

    

}
