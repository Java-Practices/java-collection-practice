import java.util.List;

public class ReduceCollection {
    public static int getMax(List<Integer> list) {
        return list.stream().reduce(list.get(0), (a, b) -> a > b ? a : b);
    }
    
    public static double getAverage(List<Integer> list) {
        return list.stream().mapToDouble(item -> item).average().orElse(0);
    }
    
    public static int getSum(List<Integer> list) {
        return list.stream().reduce(0, (sum, item) -> sum + item);
    }
    
    public static double getMedian(List<Integer> list) {
        return list.stream().mapToDouble(x -> x).sorted().skip(list.size() / 2 - (list.size() % 2 == 0 ? 1 : 0)).limit(list.size() % 2 == 0 ? 2 : 1).average().getAsDouble();
    }
    
    public static int getFirstEven(List<Integer> list) {
        return list.stream().filter(item -> item % 2 == 0).findFirst().get();
    }
}
