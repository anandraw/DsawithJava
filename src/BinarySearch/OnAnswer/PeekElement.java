package BinarySearch.OnAnswer;

public class PeekElement {
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,2};
        int n = arr.length;
        System.out.println(peakElement(arr,n));
    }

    private static int peakElement(int[] arr, int n) {
        if(n==1) return 0;
        if(arr[0]> arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];

        int start=1; int end=n-2;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]>arr[mid-1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
