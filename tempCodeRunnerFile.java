import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSimilarElements {

    public static List<Integer> findSimilarElements(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int item : arr) {
            if (seen.contains(item)) {
                duplicates.add(item);
            } else {
                seen.add(item);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 3, 5, 6, 5, 7};
        List<Integer> similarElements = findSimilarElements(myArray);
        System.out.println(similarElements);  // Output: [3, 5]
    }

}
