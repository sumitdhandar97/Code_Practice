// It was asked in Myntra
package streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);
       // Do not use this approach where we are directly writing code in main instead creating a method
        // as it is not a good practice and not recommended during Interviews
        Map.Entry<String, Integer> result = map1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                //.collect(Collectors.toList())
                .toList()
                .get(1);
        System.out.println(result);
        Map.Entry<String, Integer> nthHighestSalary = getNthHighestSalary(2, map1);
        System.out.println("The Nth Highest salary is : " + nthHighestSalary);

    }
    public static Map.Entry<String, Integer>  getNthHighestSalary(int num, Map<String, Integer> map){
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                //.collect(Collectors.toList())
                .toList()
                .get(num-1);//as index starts from 0
    }
}
