package DataStructures.Arrays;
import java.util.ArrayList;
import java.util.List;
//Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
//The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2])....

public class AliceBob {
    public static void main(String args[]) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        b.add(3);
        b.add(6);
        b.add(10);
        List<Integer> result = compareTriplets(a, b);
        System.out.println("Alice : " + result.get(0) + "\nBob : " + result.get(1));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int Alice = 0;
        int Bob = 0;
        List<Integer> score = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) > b.get(j)) {
                Alice++;
            }
            else if(a.get(i) < b.get(j)){
                Bob++;
            }
            i++;
            j++;
        }
        score.add(Alice);
        score.add(Bob);
        return score;
    }
}