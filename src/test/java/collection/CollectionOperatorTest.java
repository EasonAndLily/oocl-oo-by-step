package collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class CollectionOperatorTest {
    @Test
    public void should_pop_last_element() {
        //弹出集合最后一个元素
        int[] array = new int[]{1, 2, 3, 4, 5};
        
        CollectionOperator collectionOperator = new CollectionOperator();
        
        assertThat(collectionOperator.popLastElment(array)).isEqualTo(5);
    }
    
    @Test
    public void should_pop_common_elements() {
        //弹出两个集合的交集
        Integer[] firstArray = new Integer[]{1, 2, 4, 6, 10};
        Integer[] secondArray = new Integer[]{3, 2, 6, 10, 8};
        
        Integer[] result = new Integer[]{2, 6, 10};
        List<Integer> resultList = Arrays.asList(result);
        
        CollectionOperator collectionOperator = new CollectionOperator();
        assertThat(collectionOperator.popCommonElement(firstArray, secondArray)).isEqualTo(resultList);
    }
    
    @Test
    public void should_add_uncommon_elements_to_first_array() {
        // 将集合二中与集合一不同的元素加入集合一
        Integer[] firstArray = new Integer[]{1, 2, 4, 6, 10};
        Integer[] secondArray = new Integer[]{3, 2, 6, 10, 8};
        
        Integer[] result = new Integer[]{1, 2, 4, 6, 10, 3, 8};
        List<Integer> resultList = Arrays.asList(result);
        
        CollectionOperator collectionOperator = new CollectionOperator();
        assertThat(collectionOperator.addUncommonElement(firstArray, secondArray).size()).isEqualTo(7);
        assertThat(collectionOperator.addUncommonElement(firstArray, secondArray)).isEqualTo(resultList);
    }
}
