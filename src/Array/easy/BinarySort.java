package Array.easy;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySort {
    public static void main(String[] args) {
        int arr[] = {1, 0, -1, -1, 0};
        binSort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    public static void binSort(int[] arr) {
            // Your code goes here
            List<Integer> list = new ArrayList<>();
            for(int num:arr){
                if(num>=0){
                    list.add(num);
                }
            }

            for(int num:arr){
                if(num<0){
                    list.add(num);
                }
            }

            for(int i=0;i<arr.length;i++){
                arr[i]=list.get(i);
            }
        }
}
