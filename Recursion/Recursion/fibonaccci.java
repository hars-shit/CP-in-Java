package Recursion;

public class fibonaccci {
    public static void main(String[] args) {

        System.out.println(fibo(2)); 
    }
    static int fibo(int a){
        return (a-1)+(a-2);
    }
}
