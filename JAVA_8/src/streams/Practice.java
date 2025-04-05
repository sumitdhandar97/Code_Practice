package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

        boolean result = Stream.of("Raja", "John", "Mani", "Devi", "siva")
                .map(s -> s.toUpperCase())
                .anyMatch(s -> s.startsWith("M"));
        System.out.println("Any name starts with M? " + result);

    }

}


