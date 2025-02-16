package BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = findPos(arr, target);
        System.out.println(ans);
    }

    private static int findPos(int[] arr, int target) {

        // in infinite array we dont know the end index so it s mark as 1
        int start=0;
        int end=1;

        while (target > arr[end]){
            //store cureent end index
            int tmp = end+1;

            // then we do double sixe of end
            end = end+(end-start+1)*2;

            start=tmp;

        }
        return binarySearch(arr, target, start,end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){

        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
