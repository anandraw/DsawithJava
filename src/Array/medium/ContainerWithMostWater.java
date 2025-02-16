package Array.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 3};
    }
    public static int maxWater(int arr[]) {
        int n = arr.length;
        int left=0;

        int right=n-1;

        int ans =0;

        while(left<right){

            int tempwater=Math.min(arr[left],arr[right])*(right-left);

            ans=Math.max(ans,tempwater);

            if(arr[left]<arr[right])left++;

            else{

                right--;
            }
        }
        return ans;
    }
}
