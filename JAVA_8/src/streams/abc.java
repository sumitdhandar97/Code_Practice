package streams;

import java.util.*;
import java.util.stream.*;

public class abc {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "", "banana", "cherry");
        String joined = words.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println(joined);



    }


}
