package Recursion_Problems;

public class TrianglePattern1 {
    public static void main(String[] args) {
        Triangle(5,0);
    }
    public static void Triangle(int i, int j){
        if (i == 0){
            return;
        }
        if(i>j) {
            System.out.print("* ");
            Triangle(i, j+1);
        }
        else{
            System.out.println();
            Triangle(i-1, 0);
        }
    }
}
