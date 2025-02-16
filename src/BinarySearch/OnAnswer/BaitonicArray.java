package BinarySearch.OnAnswer;

public class BaitonicArray {
    public static void main(String[] args) {
        //means having only one peek element
        int arr[] = {5, 10, 15, 20, 4, 2, 3, 1};
        int n = arr.length;
        System.out.println(findMaxBitonic(arr,n));
    }

    private static int findMaxBitonic(int[] arr, int n) {
        int start=0; int end =n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid+1]) {
                return mid;
            } else if (arr[mid]> arr[mid+1]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
               start=mid+1;
            }
        }
        return -1;
    }
}
