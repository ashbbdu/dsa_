package Arrays.Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {

    public static List<Integer> unionArrayOptimal (int [] nums1 ,  int [] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] <= nums2[j] ) {
                if(ans.isEmpty() || ans.get(ans.getLast() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;
            } else {
                if(ans.isEmpty() || ans.get(ans.getLast() - 1) != nums2[j]) {
                    ans.add(nums2[j]);

                }
                j++;
            }
        }

//        if nums2 is empty;
        while(i < nums1.length) {
            if(ans.isEmpty() || ans.get(ans.getLast() -1 ) != nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }
//      if nums1 is empty;
        while(j < nums2.length) {
            if(ans.isEmpty() || ans.get(ans.getLast() -1 ) != nums2[j]) {
                ans.add(nums2[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] arr1 = {1 , 1 , 2 , 3 , 4 , 5};
        int [] arr2 = {2 , 3 , 4 , 4 , 5 , 6};

        System.out.println((unionArrayOptimal(arr1 , arr2)));


    }
}
