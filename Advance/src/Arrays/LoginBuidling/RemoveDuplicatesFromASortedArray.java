package Arrays.LoginBuidling;

import java.util.TreeSet;

public class RemoveDuplicatesFromASortedArray {
    public static int removeDuplicatesBrute(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        int cnt = 0;
        for(var num : nums) {
            ts.add(num);
        }

        for(var num : ts) {
            nums[cnt++] = num;
        }

        return ts.size();
    }
    public static void main(String[] args) {
        int [] nums = {0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicatesBrute(nums));
    }
}
