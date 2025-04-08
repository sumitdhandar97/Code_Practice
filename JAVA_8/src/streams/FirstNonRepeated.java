package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        String[] split = input.split("");
        System.out.println(Arrays.toString(split));

        //first approach
        Character result =
                input.chars() // Stream of String
                        //.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                        //.mapToObj(c -> Character.toLowerCase((char) c))
                        .mapToObj(c -> ((char) c))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() == 1L)
                        .map(entry -> entry.getKey())
                        .findFirst()
                        .get();
        System.out.println("First non-repeated character: " + result);

        // if max reccuring character asked
        System.out.println("max recurring character ");
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);
        Map.Entry<String, Long> max = collect
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get();
        System.out.println(max);

        //second approach :recommended
        Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                //.map(entry -> entry.getKey())
                .map(Map.Entry::getKey) //using method reference
                .findFirst()
                .get();
        System.out.println("First non-repeated character: " + result);

        //third approach
        input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);
        System.out.println("First non-repeated character: " + result);
    }
}


