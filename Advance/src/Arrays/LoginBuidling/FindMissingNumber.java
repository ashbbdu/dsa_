package Arrays.LoginBuidling;

public class FindMissingNumber {
    public static int missingNumberOptimalI(int[] nums) {
        int n = nums.length;
        int count = 0;
        int sum = (n * (n + 1)) / 2;
        for(int i = 0 ; i < n ; i++) {
            count = count + nums[i];
        }
        return sum - count;
    }
    public static void main(String[] args) {
        int [] nums = {0, 2, 3, 1, 4};
        System.out.println(missingNumberOptimalI(nums));
    }
}
