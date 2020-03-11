import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ReduceCollectionTest {
    
    @Test
    void should_get_maximum_of_list() {
        List<Integer> input = Arrays.asList(2, 4, 6, 3, 60, 54, 34);
        int output = ReduceCollection.getMax(input);
        Assertions.assertEquals(60, output);
    }
    
    @Test
    void should_get_average_of_list() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        double output = ReduceCollection.getAverage(input);
        Assertions.assertEquals(3, output);
    }
    
    @Test
    void should_get_sum_of_list() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int output = ReduceCollection.getSum(input);
        Assertions.assertEquals(15, output);
    }
    
    @Test
    void should_get_median_of_list() {
        List<Integer> input1 = Arrays.asList(1, 1, 3, 4, 5);
        List<Integer> input2 = Arrays.asList(1, 3, 3, 4);
        double output1 = ReduceCollection.getMedian(input1);
        double output2 = ReduceCollection.getMedian(input2);
        Assertions.assertEquals(3, output1);
        Assertions.assertEquals(3, output2);
    }
    
    @Test
    void should_get_first_even_of_list() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int output = ReduceCollection.getFirstEven(input);
        Assertions.assertEquals(2, output);
    }
}