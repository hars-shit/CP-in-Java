// input abcdefg;
// remove def;
// output abcg
package Recursion.Subset;

public class skipString {
    public static void main(String[] args) {

       System.out.println(skip("abcdefg")); 
    }

    static String skip(String up) {
        if (up.isEmpty()) {

            return "";
        }

        if (up.startsWith("def")) {
            return skip(up.substring(3));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }

    }
}
