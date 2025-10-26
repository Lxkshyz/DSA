package Recursion_Problems;


public class SkipCharacter {
    public static void main(String[] args) {
        String a = "baccad";
        System.out.println(skip(a, 'c', 0));
    }

    public static String skip(String a, char toSkip, int count) {
        if (count == a.length()) return "";
        char ch = a.charAt(count);
        if (ch != toSkip) {
            return ch + skip(a, toSkip, ++count);
        }
        return skip(a, toSkip, ++count);
    }
}