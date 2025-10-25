package Arrays.Fundamentals;

public class RotateArrayByK {

    public static void rotateLeftByKBrute (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int[k];
        for(int i = 0 ; i < temp.length ; i++) {
            temp[i] = nums[i];
        }

        for(int i = k ; i < n ; i++) {
            nums[i - k] = nums[i];
        }

        for(int i = 0 ; i < temp.length ; i++) {
            nums[(n+i) - k] = temp[i];
        }


    }

    public static void reverseArray (int [] nums , int start , int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeftByKOptimal (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
        reverseArray(nums , 0 , k -1);
        reverseArray(nums , k , n - 1);
        reverseArray(nums , 0 , n - 1);
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
//        rotateLeftByKBrute(nums , k);
        rotateLeftByKOptimal(nums , k);
        System.out.println();
        for(var num : nums) {
            System.out.print(num + " ");
        }
    }


}
