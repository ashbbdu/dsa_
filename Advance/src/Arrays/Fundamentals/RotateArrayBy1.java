package Arrays.Fundamentals;

public class RotateArrayBy1 {

    public static void rotateArrayBy1 (int [] nums) {
        int temp = nums[0];
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        int [] nums = {-1, 0, 3, 6};
        rotateArrayBy1(nums);

        for(var num : nums) {
            System.out.print(num + " ");
        }
    }
}
