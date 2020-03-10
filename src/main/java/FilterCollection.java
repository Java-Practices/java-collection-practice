import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {
    
    public static List<Integer> getAllEvens(List<Integer> list) {
        return list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
    }
    
    public static List<Integer> removeDuplicateElements(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
    
    public static List<Integer> getCommonElements(List<Integer> collection1, List<Integer> collection2) {
        return collection1.stream().filter(item -> collection2.contains(item)).collect(Collectors.toList());
    }
}
