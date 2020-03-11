import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MapCollectionTest {
    @Test
    void should_return_double_item_collection() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = MapCollection.doubleCollection(input);
        Assertions.assertEquals(Arrays.asList(2, 4, 6, 8, 10), output);
    }
    
    @Test
    void should_return_chars_collection() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<String> output = MapCollection.mapToStringCollection(input);
        Assertions.assertEquals(Arrays.asList("a", "b", "c", "d", "e"), output);
    }
    
    @Test
    void should_return_uppercase_collection() {
        List<String> input = Arrays.asList("a", "b", "c", "d", "e");
        List<String> output = MapCollection.uppercaseCollection(input);
        Assertions.assertEquals(Arrays.asList("A", "B", "C", "D", "E"), output);
    }
    
    @Test
    public void can_transform_two_dimensional_collection_to_one() {
        //把二维数组变成一维数组
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3, 4));
        List<Integer> output = MapCollection.transformTwoDimensionalToOne(input);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4), output);
    }
}