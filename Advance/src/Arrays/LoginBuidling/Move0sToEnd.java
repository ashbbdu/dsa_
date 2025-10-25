package Arrays.LoginBuidling;

public class Move0sToEnd {
    public static void moveZeroes(int[] nums) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
                nums[cnt++] = nums[i];
            }
        }

        while(cnt < nums.length) {
            nums[cnt++] = 0;
        }
    }
    public static void main(String[] args) {
        int [] nums = {0, 1, 4, 0, 5, 2};
        moveZeroes(nums);
        for(var num : nums) {
            System.out.print(num + " ");
        }
    }
}
