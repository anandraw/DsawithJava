package BinarySearch.OnAnswer;

import java.util.Arrays;
public class KokoEatinngBanan {
    public static void main(String[] args) {
        int[] v = {3, 6, 7, 11};
        int h = 8;
        int banana = kokoEat(v, h);
        System.out.println(banana);
    }

    public static int kokoEat(int[] arr, int k) {

        int start =1;
        int end = Arrays.stream(arr).max().getAsInt();

        while (start<=end){
            int mid = start+(end-start)/2;
            int totalhous=calculateTotalHourd(arr, mid);
            if(totalhous<=k){
                end=mid-1;
            }else{
                start=start+1;
            }
        }
        return start;
    }


    public static int calculateTotalHourd(int [] arr, int hour){
        int totalH=0;
        for (int i = 0; i < arr.length; i++) {
            totalH += Math.ceil((double)(arr[i]) / (double)(hour));
        }
        return totalH;
    }
}
