package Recursion.easy;

import java.util.ArrayList;

public class ArrayisOsrtedOrNot {
    public static void main(String[] args) {
        int[] arr ={1,2,8,4,5,7,7}; int target= 7;
        System.out.println(sorted(arr,0));

        int result =  findIndex(arr,target,0);
        System.out.println(result);

        ArrayList<Integer> allIndex = findAllIndex(arr, target, 0);
        System.out.println(allIndex);


    }

    static boolean sorted(int[] arr, int index){

        // base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index== arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }else {
            return findIndex(arr,target,index+1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
             list.add(index);
        }
        ArrayList<Integer> allIndex = findAllIndex(arr, target, index + 1);
        list.addAll(allIndex);
        return list;

    }
}
