package Array.easy;

import java.util.ArrayList;
import java.util.Collections;

public class   Add1ToNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(9);   // when i add 1 to this no so ouput will be 130 ok.
        ArrayList<Integer> result = addOneToNumber(arr);
        System.out.println(result);

       // ArrayList<Integer> result1 = add1ToNumber(arr);
      //  System.out.println(result1);


    }

    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr){

        int carry=1;
        Collections.reverse(arr);

        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i)+carry;
            arr.set(i,sum%10);
            carry =sum/10;

            if (carry==0) break;
        }
        if (carry==1){
            arr.add(1);
        }
        Collections.reverse(arr);
        return arr;

    }

    public static ArrayList<Integer> add1ToNumber(ArrayList<Integer> arr){

        for (int i = arr.size()-1; i >= 0; i--) {
            int digit =arr.get(i);
            if (digit==9&&i==0){
                arr.set(i,0);
                arr.add(0,1);
            } else if (digit==9) {
                arr.set(i,0);
            }else{
                arr.set(i,digit+1);
                break;
            }

        }
        while (arr.get(0)==0&&arr.size()>1){
                arr.remove(0);
        }
        return arr;
    }
}
