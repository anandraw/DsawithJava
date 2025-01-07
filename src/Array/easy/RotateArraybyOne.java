package Array.easy;

public class RotateArraybyOne {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        roatete(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
    static void roatete(int[] arr){

        int n = arr.length;
        int a=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=a;
    }
}
