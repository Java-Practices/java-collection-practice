import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CollectionOperationTest {
    
    @Test
    void should_return_list_by_interval_when_left_less_than_right() {
        int right = 5;
        int left = 1;
        List<Integer> output = CollectionOperation.getListByInterval(left, right);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5), output);
    }
    
    @Test
    void should_return_list_by_interval_when_left_more_than_right() {
        int left = 5;
        int right = 1;
        List<Integer> output = CollectionOperation.getListByInterval(left, right);
        Assertions.assertEquals(Arrays.asList(5, 4, 3, 2, 1), output);
    }
    
    @Test
    void should_pop_last_element() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = CollectionOperation.removeLastElement(input);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4), output);
    }
    
    @Test
    void should_sort_int_list_by_desc() {
        List<Integer> input = Arrays.asList(1, 3, 2, 4, 5);
        List<Integer> output = CollectionOperation.sortDesc(input);
        Assertions.assertEquals(Arrays.asList(5, 4, 3, 2, 1), output);
    }
    
    @Test
    void should_reverse_list() {
        List<Integer> input = Arrays.asList(1, 3, 2, 4, 5);
        List<Integer> output = CollectionOperation.reverseList(input);
        Assertions.assertEquals(Arrays.asList(5, 4, 2, 3, 1), output);
    }
    
    @Test
    void should_concat_two_list() {
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> input2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> output = CollectionOperation.concat(input1, input2);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), output);
    }
    
    @Test
    void should_union_two_list() {
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> input2 = Arrays.asList(3, 5, 4, 9, 10);
        List<Integer> output = CollectionOperation.union(input1, input2);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 9, 10), output);
    }
}