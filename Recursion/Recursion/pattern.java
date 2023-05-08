package Recursion;
// print using recursion
// * * * * *
// * * * * 
// * * * 
// * * 
// *

public class pattern {
    public static void main(String[] args) {
        pyramid(4,0);
    }

    static void pyramid(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            System.out.print("*");
            pyramid(row,col+1);
        } else {
            System.out.println();
            pyramid(row-1,0);
        }
    }
}
