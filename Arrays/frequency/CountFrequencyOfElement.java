package frequency;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElement {

    public static void countFrequency(int[] arr)
    {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }

        for(Map.Entry<Integer,Integer> entryset : map.entrySet())
        {
            System.out.println(entryset.getKey() + " occurs " + entryset.getValue() + " times");
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{25,4,25,25,8,9,2,2,40,3,40};
        countFrequency(arr);
       // CountFrequencyOfElement cn =new CountFrequencyOfElement();
        //cn.countFrequency(arr);
    }
}
