package Array.easy;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[] = {1, 1,1,1}; //output 2
        int r = findEquilibrium(arr);
        System.out.println(r);

    }
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ls=0;
        for(int i=0;i<n;i++){
            sum-=arr[i];
            if(ls==sum) return i;
            ls+=arr[i];
        }
        return -1;
    }
}
