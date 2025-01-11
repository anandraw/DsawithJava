package Array.easy;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int[] arr={0,0,1};//ans=2
        int r =transitionPoint(arr);
        System.out.println(r);

    }
   static int transitionPoint(int arr[]) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                return i;
            }
        }
        return -1;
    }
}
