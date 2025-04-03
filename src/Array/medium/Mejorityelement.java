package Array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mejorityelement {
    public static void main(String[] args) {
        int[] arr ={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
//        int reasult =mejorityElement(arr);
//        System.out.println(reasult);
        for (Integer integer : findMajority(arr)) {
            System.out.print(integer+" ");

        }

    }
    static int mejorityElement(int[] arr){

//        for (int i = 0; i < arr.length; i++) {
//            int cnt=0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i]==arr[j]){
//                    cnt++;
//                }
//            }
//            if (cnt>(arr.length/2)) return arr[i];
//        }
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i <arr.length ; i++) {
            //map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i], value+1);
        }

        for (Map.Entry<Integer,Integer> r : map.entrySet()){
            if (r.getValue()>(arr.length/2)){
                return r.getKey();
            }
        }
        return -1;
    }
    public static  List<Integer> findMajority(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer,Integer> result :map.entrySet()){
            if (result.getValue()>(nums.length/3)){
                list.add(result.getKey());
            }
        }
        return list;
    }
}
