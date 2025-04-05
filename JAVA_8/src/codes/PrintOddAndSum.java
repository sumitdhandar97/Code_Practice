package codes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintOddAndSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = numbers.stream()
                .reduce(4, (a, b) -> a * b);
// result: Optional[120]
        //Integer i = result.get();
        System.out.println(reduce);


    }
}
