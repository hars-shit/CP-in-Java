package Recursion;

public class reverseString {
   public static void main(String[] args) {
   System.out.println( reverseSt("harshit"));
   } 
   static String reverseSt(String p){
     // base condition 
    if(p.isEmpty()){
        return p;
    }
   
     return reverseSt(p.substring(1)) + p.charAt(0);
       
    
   }
}
