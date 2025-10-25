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


    public static int removeDuplicatesOptimal(int[] nums) {  int i = 0;
        for(int j = 1; j < nums.length ; j++) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] nums = {0, 0, 3, 3, 5, 6};
        int [] arr = {0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicatesBrute(nums));
        System.out.println(removeDuplicatesOptimal(arr));
    }
}
