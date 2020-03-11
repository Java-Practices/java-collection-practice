import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperation {
    
    public static List<Integer> getListByInterval(int left, int right) {
        return IntStream.iterate(left, i -> left < right ? ++i : --i).limit(Math.abs(left - right) + 1).boxed().collect(Collectors.toList());
    }
    
    
    public static List<Integer> removeLastElement(List<Integer> list) {
        return list.stream().limit(list.size() - 1).collect(Collectors.toList());
    }
    
    public static List<Integer> sortDesc(List<Integer> list) {
        return list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
    }
    
    
    public static List<Integer> reverseList(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
    
    
    public static List<Integer> concat(List<Integer> list1, List<Integer> list2) {
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
    
    public static List<Integer> union(List<Integer> list1, List<Integer> list2) {
        // method 1:
        return Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        // method 2:
        // return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet()).stream().collect(Collectors.toList());
    }
    
    public static boolean isAllElementsEqual(List<Integer> list1, List<Integer> list2) {
        return list1.stream().allMatch(item -> list2.contains(item)) && list2.stream().allMatch(item -> list1.contains(item));
    }
}
