package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {
    
    private Integer[][] array = null;
    
    public Flaten(Integer[][] array) {
        this.array = array;
    }
    
    public List<Integer> transformToOneDimesional() {
        return Stream.of(array).flatMap(Arrays::stream).collect(Collectors.toList());
    }
    
    public List<Integer> transformToUnrepeatedOneDimesional() {
        return Stream.of(array).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
    }
}
