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


    public static int secondLargestBetter (int [] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > secondLargest && nums[i] != largest ) {
                secondLargest = nums[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static int secondLargestOptimal (int [] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {

            if(nums[i] > largest) {
                secondLargest = largest; // jaise hi usko naya largest milega wo prev largest ko second largest kr dega
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
//            else {
//                return 2; // just for testing
//            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 7, 7, 5};
        System.out.println(secondLargestBrute(arr));
        System.out.println(secondLargestBetter(arr));
        System.out.println(secondLargestOptimal(arr));
    }
}
