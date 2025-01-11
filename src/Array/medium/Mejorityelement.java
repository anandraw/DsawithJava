package Array.medium;

import java.util.HashMap;
import java.util.Map;

public class Mejorityelement {
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        int reasult =mejorityElement(arr);
        System.out.println(reasult);
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
}
