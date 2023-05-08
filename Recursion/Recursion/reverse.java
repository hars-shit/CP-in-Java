package Recursion;

public class reverse {

static int sum=0;
static int handleReverse(int a){
    if(a==0){
        return 0;
    }
    
    int rem=a%10;
   sum=(sum*10)+rem;
   return handleReverse(a/10);
}
public static void main(String[] args) {
    
    handleReverse(1342);
    System.out.println("reverse no-:"+sum);
}
}