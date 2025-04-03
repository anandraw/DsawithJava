package HashMap;

import java.util.HashSet;

public class MinimumCommonValue {
    public static void main(String[] args) {

    }
    static int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    min = Math.min(min, nums1[i]);
                    found = true;
                }
            }
        }

        return found ? min : -1;
    }
    static int getCommonOptimal(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num:nums1){
            set.add(num);
        }
        int min = Integer.MAX_VALUE;
        for(int num:nums2){
            if (set.contains(num)){
                return num;
            }
        }
        return -1;
    }
}
