package Arrays.FAQMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {
    public static List<Integer> leadersOptimal(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        leaders.add(nums[nums.length - 1]);
        int leader = nums[nums.length - 1];

        for(int i = nums.length - 1 ; i >= 0 ; i--) {
            if(leader < nums[i]) {
                leaders.add(nums[i]);
                leader = nums[i];
            }
        }
//        Collections.sort(leaders , Collections.reverseOrder());
        Collections.reverse(leaders);
       return leaders;
    }

    public static List<Integer> leadersBrute(int[] nums) {
        List<Integer> leaders = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++) {
            boolean flag = true;
            for(int j = i+1 ; j <= nums.length - 1 ; j++) {
                if(nums[i] <= nums[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                leaders.add(nums[i]);
            }
        }


        return leaders;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,0,0,0};
        System.out.println(leadersOptimal(nums));
        System.out.println(leadersBrute(nums));
    }
}
