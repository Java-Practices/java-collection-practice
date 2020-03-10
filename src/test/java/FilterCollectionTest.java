import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FilterCollectionTest {
    @Test
    public void should_return_all_evens() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> outPut = FilterCollection.getAllEvens(input);
        Assertions.assertEquals(Arrays.asList(2, 4), outPut);
    }
    
    @Test
    public void should_return_different_elements_in_arrayList() {
        // remove duplicate elements
        List<Integer> input = Arrays.asList(1, 1, 1, 2, 3);
        List<Integer> outPut = FilterCollection.removeDuplicateElements(input);
        Assertions.assertEquals(Arrays.asList(1, 2, 3), outPut);
    }
    
    @Test
    public void should_return_common_elements() {
        List<Integer> input1 = Arrays.asList(6, 2, 3, 4, 9);
        List<Integer> input2 = Arrays.asList(2, 3, 5, 9, 6);
        List<Integer> outPut = FilterCollection.getCommonElements(input1, input2);
        Assertions.assertEquals(Arrays.asList(6, 2, 3, 9), outPut);
    }
}