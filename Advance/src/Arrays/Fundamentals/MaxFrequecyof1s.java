package Arrays.Fundamentals;

public class MaxFrequecyof1s {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxFreq = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxFreq = Math.max(maxFreq , count);
            } else {
                count = 0;
            }
        }
        return maxFreq;
    }
    public static void main(String[] args) {
        int [] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
