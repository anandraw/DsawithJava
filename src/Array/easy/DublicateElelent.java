package Array.easy;

import java.util.*;

public class DublicateElelent {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,4,5};                       // 2,3
        List<Integer> list = printDulicate(arr);
        for (int a:list){
            System.out.print(a+" ");
        }
        System.out.println();
        findDuplicates(arr);
        List<Integer> list1 = findDuplicates(arr);
        for (int a:list1){
            System.out.print(a+" ");
        }
    }

    static List<Integer> printDulicate(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){

                    if (!ans.contains(arr[i])){
                        ans.add(arr[i]);
                    }
                    break;
                }
            }
        }
        return ans;
    }

    static List<Integer> findDuplicates(int[]arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
             map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        for (Map.Entry<Integer, Integer> result : map.entrySet()) {
            if(result.getValue()>1){
                ans.add(result.getKey());
            }
        }
        return ans;
    }

}
