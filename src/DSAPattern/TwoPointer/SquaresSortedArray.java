package DSAPattern.TwoPointer;

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        sortedSquares(nums);
        sortedSquaresOptimal(nums);
    }
    public static int[] sortedSquares(int[] nums) {

        // brutofroce  -> nlogn
        int[] arr = new int[nums.length];
        int i=0;
        for (int num:nums){   // o(n)
            arr[i] = num*num;
            i++;
        }
        Arrays.sort(arr); // nLogn
        for (int num:arr){
            System.out.print(num+" ");
        }
        return arr;
    }

    public static int[] sortedSquaresOptimal(int[] nums) {

        // optimal -> O(n) -> think about two  pinter
        int n = nums.length;;
        int[] result = new int[n];
        int left=0; int right= n-1;
        int i=n-1;

        while (left<=right){
            int leftSqure = nums[left]*nums[left];
            int rigthSqure = nums[right]*nums[right];

            if (leftSqure>rigthSqure){
                result[i] = leftSqure;
                i--;
                left++;
            }else {
                result[i]=rigthSqure;
                i--;
                right--;
            }
        }
        return result;
    }
}

