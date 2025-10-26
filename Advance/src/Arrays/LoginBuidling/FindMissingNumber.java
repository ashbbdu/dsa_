package Arrays.LoginBuidling;

public class FindMissingNumber {

    public static int missingNumberBrute(int[] nums) {
        int n = nums.length;


        for(int i = 0 ; i <= n ; i++) {
            int flag = 0;
           for(int j = 0 ; j < n  ; j++) {
               if(nums[j] == i) {
                   flag =1;
                   break;
               }
           }
           if(flag == 0) return i;
        }
        return -1;
    }


    public static int missingNumberOptimalII(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
//        for(int i = 0 ; i <= n ; i++) {
//           xor1 = xor1 ^ i;
//        }
//        for(int i = 0 ; i < n ; i++) {
//            xor2 = xor2 ^ nums[i];
//        }

//        using a single loop
        for(int i = 0 ; i < n ; i++) {
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ nums[i];
        }
        return xor1 ^ xor2;

    }

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
        System.out.println(missingNumberBrute(nums));
        System.out.println(missingNumberOptimalI(nums));
        System.out.println(missingNumberOptimalII(nums));
    }
}
