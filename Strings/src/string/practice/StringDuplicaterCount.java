package string.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicaterCount
{
    public static void main(String[] args) {


        String inputString = "Java Concept Of The Day";
        char[] chrr = inputString.toCharArray();
        //Map<Character, Long> charCountMap = Arrays.stream(r).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        Map<Character, Long> charCountMap =
//                inputString.chars()
//                        .mapToObj(c -> (char) c)
//                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       // System.out.println(charCountMap);
    }

    private static void duplicateCount(String str1) {
        char[] str = str1.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char s: str){
            if(map.containsKey(s)) {
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        System.out.println(str1+" : "+map);
        }
    }


