package collection;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public int popLastElment(int[] array) {
        return Arrays.stream(array).reduce((first, second) -> second).orElse(0);
    }
    
    public List<Integer> popCommonElement(Integer[] firstArray, Integer[] secondArray) {
      return Arrays.asList(firstArray).stream().filter(number -> Arrays.asList(secondArray).contains(number)).collect(Collectors.toList());
    }
    
    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        return Stream.concat(Arrays.asList(firstArray).stream(),
                Arrays.asList(secondArray).stream().filter(number -> !Arrays.asList(firstArray).contains(number)))
                .collect(Collectors.toList());
    }
}
