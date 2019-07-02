package collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int maxNumber = Math.max(leftBorder, rightBorder);
        int minNumber = Math.min(leftBorder, rightBorder);
        return IntStream.rangeClosed(minNumber, maxNumber).filter(number -> number % 2 == 0).reduce(0, (subtotal, number) -> subtotal + number);
    }
    
    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(number -> number % 2 == 1 ? number * 3 + 2 : number).collect(Collectors.toList());
    }
    
    public Integer getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(number -> number % 2 == 1).map(number -> number * 3 + 5).reduce(0, (subtotal, number) -> subtotal + number);
    }
    
    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder, rightBorder), Math.max(rightBorder, leftBorder)).filter(number -> number % 2 == 1).sum();
    }
    
    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().reduce(0, (subtotal, number) -> subtotal + (number * 3 + 2));
    }
    
    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> evens = arrayList.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        int middle = evens.size() / 2;
        if (evens.size() % 2 == 1) {
            return evens.get(middle);
        } else {
            return (evens.get(middle - 1) + evens.get(middle)) / 2;
        }
    }
    
    public Double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(number -> number % 2 == 0).mapToDouble(i -> i).average().orElse(0);
    }
    
    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer existedElment) {
        return arrayList.stream().filter(number -> number % 2 == 0).anyMatch(number -> number == existedElment);
    }
    
    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(number -> number % 2 == 0).distinct().collect(Collectors.toList());
    }
    
    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        return Stream.concat(arrayList.stream().filter(number -> number % 2 == 0).sorted(), arrayList.stream().filter(number -> number % 2 == 1).sorted((a, b) -> b - a)).collect(Collectors.toList());
    
        
    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        return arrayList.stream().map(numnber -> numnber.)
    }
}
