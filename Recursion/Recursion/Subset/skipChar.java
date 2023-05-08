// string=adnaia 
// remove a 
// output=>dni

package Recursion.Subset;

public class skipChar {
    public static void main(String[] args) {
        skip(" ","adnaia");
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
       char ch=up.charAt(0);
        if(ch=='a'){
            // substring make an new object and remove the first char
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }
}
