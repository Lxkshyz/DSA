package DataStructures.Arrays;
import java.util.*;

public class ResultGrading {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> rounded = gradingStudents(grades);
        System.out.println("Original: " + grades);
        System.out.println("Rounded:  " + rounded);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int i : grades) {
            if (i < 38) result.add(i);
            else {
                int next = ((i + 4) / 5) * 5;
                int diff = next - i;
                result.add(diff < 3 ? next : i);
            }
        }
        return result;
    }
}