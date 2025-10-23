package Arrays.Fundamentals;

import java.util.Arrays;

public class SecondLargestElement {

    public static int secondLargestBrute (int [] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1;  i > 0 ; i--) {
            if(nums[i] != nums[i - 1]) {
               return nums[i - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {7, 7, 2, 2, 10, 10, 10};
        System.out.println(secondLargestBrute(arr));;
    }
}
