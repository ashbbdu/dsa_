package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class BasicHashing {
    public static boolean checkDuplicate(int [] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(var ch : nums) {
            if(ans.contains(ch)) return true;
            ans.add(ch);
        }
        return false;
    }
    public static void main(String[] args) {
        HashMap<String , Integer>  map = new HashMap<>();
        map.put("Ashish" , 1);
        map.put("Virat" , 18);
        map.put("Rohit" , 45);
        System.out.println(map.containsKey("Ashish"));

//        Check if the array container duplicate
        int[] nums = {1, 2, 3, 1};
        boolean ans = checkDuplicate(nums);
        System.out.println(ans);
    }
}
