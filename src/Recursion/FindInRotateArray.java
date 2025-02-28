package Recursion;

public class FindInRotateArray {
    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2,3}; int target = 2;
        int search = search(nums, target,0, nums.length-1);

        System.out.println(search);
    }

    private static int search(int[] nums, int target,int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return search(nums, target, start, mid - 1);
            } else {
                return search(nums, target, mid + 1, end);
            }
        }

        if (target>=nums[mid] && target<=nums[end]){
            return search(nums,target,mid+1,end);
        }
        return search(nums,target,start,mid-1);
    }
}
