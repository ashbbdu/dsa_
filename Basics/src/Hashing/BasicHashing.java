package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BasicHashing {
    public static boolean checkDuplicate(int [] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(var ch : nums) {
            if(ans.contains(ch)) return true;
            ans.add(ch);
        }
        return false;
    }

    public static void countFrequencies (int [] nums) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(var num : nums) {
            if(freq.containsKey(num)) {
                int currentCount = freq.get(num);
                freq.put(num , currentCount + 1);
            } else {
                freq.put(num , 1);
            }
        }

        System.out.println(freq);
    }


    public static int countHighestFrequencies (int [] nums) {
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(var num : nums) {
            if(freq.containsKey(num)) {
                int currentCount = freq.get(num);
                freq.put(num , currentCount + 1);
            } else {
                freq.put(num , 1);
            }
        }
        int highest = -1;
        int numberWithHighestFreq = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " -> " + value);
//       try doing dry run
            if (highest < value) {
                highest = value;
                numberWithHighestFreq = key;
            } else if(value == highest) {
                numberWithHighestFreq = Math.min(numberWithHighestFreq, key);
            }

        }


    return numberWithHighestFreq;
    }
    public static void main(String[] args) {
        HashMap<String , Integer>  map = new HashMap<>();
        map.put("Ashish" , 1);
        map.put("Virat" , 18);
        map.put("Rohit" , 45);
        System.out.println(map.containsKey("Ashish"));
        System.out.println(map.keySet());

//        Check if the array container duplicate
        int[] nums = {1, 2, 3, 1};
        boolean ans = checkDuplicate(nums);
        System.out.println(ans);
        int [] nums1 = {100,200,200,300,300};
        countFrequencies(nums1);
        System.out.println( countHighestFrequencies(nums1));;
    }
}
