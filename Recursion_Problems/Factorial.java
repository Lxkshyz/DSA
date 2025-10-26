package Recursion_Problems;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // 120 factorial
        System.out.println(fact(5));
    }
    public static int fact(int num){
        if (num == 1){
            return num;
        }
        return num * fact(--num);
    }
}
