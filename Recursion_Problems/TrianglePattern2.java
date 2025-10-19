package Recursion_Problems;

class TrianglePattern2{
    public static void main(String[] args) {
        Triangle(5, 0);
    }
    public static void Triangle(int i, int j){
        if ( i == 0){
            return;
        }
        if (i>j){
            Triangle(i, ++j);
            System.out.print("* ");
        }
        else{
            Triangle(--i, 0);
            System.out.println();
        }
    }
}