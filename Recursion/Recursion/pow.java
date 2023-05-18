package Recursion;

public class pow {
   public static void main(String[] args) {
    System.out.println(isPower(144));
   }
   static boolean isPower(int n){
    if(n<1){
        return false;
    }
    if(n==1){
        return true;
    }
    if(n%2==1){
        return false;
    }
    // if n is not satisfying then try to check for its by 2 number
    return (isPower(n/2));
   } 
}
