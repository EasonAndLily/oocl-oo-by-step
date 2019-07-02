package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {
    private Random random = new Random();
    
    public InverseReduce() {}
    
    public InverseReduce(Random random) {
        this.random = random;
    }
    
    public List<Integer> divideToSmaller(int number) {
        int divideNumber = random.nextInt(3);
        
        List<Integer> numbers = new ArrayList<>();
        while (number - divideNumber > 0) {
            int nextNumber = number - divideNumber;
            numbers.add(nextNumber);
            number = nextNumber;
        }
        
        return numbers;
    }
}
