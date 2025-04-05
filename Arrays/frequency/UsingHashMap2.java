package frequency;

import java.util.HashMap;
import java.util.Map;

class CountFrequencyOfElementInArray
{
    static void countFreq(int[] arr)
    {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " occurs " + entry.getValue()+" times ");
        }
    }
    // Driver code
    public static void main(String []args)
    {
        int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
        countFreq(arr);
    }
}
