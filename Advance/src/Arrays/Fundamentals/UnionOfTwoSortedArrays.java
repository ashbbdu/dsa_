package Arrays.Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays {

    public static int [] unionArrayOptimal (int [] nums1 ,  int [] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] <= nums2[j] ) {
                if(ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;
            } else {
                if(ans.isEmpty() || ans.get(ans.size() - 1) != nums2[j]) {
                    ans.add(nums2[j]);

                }
                j++;
            }
        }

//        if nums2 is empty;
        while(i < nums1.length) {
            if(ans.isEmpty() || ans.get(ans.size() -1 ) != nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }
//      if nums1 is empty;
        while(j < nums2.length) {
            if(ans.isEmpty() || ans.get(ans.size() -1 ) != nums2[j]) { // ans.isEmpty() is only used to haddnle these cases  nums1 = [] , nums2 = [] etc
                ans.add(nums2[j]);
            }
            j++;
        }
        int [] ansArray = new int [ans.size()];
        for(int k = 0 ;  k < ans.size() ; k++) {
            ansArray[k] = ans.get(k);
        }
        return ansArray;
    }

    public static void main(String[] args) {
        int [] arr1 = {1 , 1 , 2 , 3 , 4 , 5};
        int [] arr2 = {2 , 3 , 4 , 4 , 5 , 6};

        int [] ans = (unionArrayOptimal(arr1 , arr2));
        System.out.println(Arrays.toString(ans));


    }
}
