package Arrays.Fundamentals;

public class RotateArrayByK {

    public static void rotateLeftByKBrute (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int[k];
        int [] main = new int[n];
        for(int i = 0 ; i < temp.length ; i++) {
            temp[i] = nums[i];
        }

        for(int i = k ; i < main.length ; i++) {
            nums[i - k] = nums[i];
        }

        for(int i = 0 ; i < temp.length ; i++) {
            nums[(n+i) - k] = temp[i];
        }


    }

    public static void main(String[] args) {
        int [] nums = {3, 4, 1, 5, 3, -5};
        int k = 8;


        rotateLeftByKBrute(nums , k);
        System.out.println();
        for(var num : nums) {
            System.out.print(num + " ");
        }
    }


}
