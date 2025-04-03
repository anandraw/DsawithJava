package HashMap;

import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public int majorityElements(int[] nums) {
        int candidate = 0, count = 0;

        for(int num:nums){
            if (count==0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
