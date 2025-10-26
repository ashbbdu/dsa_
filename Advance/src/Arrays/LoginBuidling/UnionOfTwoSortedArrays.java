package Arrays.LoginBuidling;

import java.util.TreeSet;

public class UnionOfTwoSortedArrays {

    public static int[] unionArrayBrute(int[] nums1, int[] nums2) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(var num : nums1) {
            ts.add(num);
        }
        for(var num : nums2) {
            ts.add(num);
        }

        int [] ans = new int[ts.size()];
        int cnt = 0;
        for(var num : ts) {
            ans[cnt++] = num;
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 = {1, 2, 7};

        int [] ans = unionArrayBrute(nums1 , nums2);
        for(var num : ans) {
            System.out.print(num + " ");
        }
    }
}
