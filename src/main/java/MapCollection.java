import java.util.List;
import java.util.stream.Collectors;

public class MapCollection {
    
    public static List<Integer> doubleCollection(List<Integer> list) {
        return list.stream().map(item -> item * 2).collect(Collectors.toList());
    }
    
    public static List<String> mapToStringCollection(List<Integer> list) {
        return list.stream().map(item -> Character.toString((char) (item + 96))).collect(Collectors.toList());
    }
    
    public static List<String> uppercaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
    
    public static List<Integer> transformTwoDimensionalToOne(List<List<Integer>> list) {
        return list.stream().flatMap(item -> item.stream()).collect(Collectors.toList());
    }
}
