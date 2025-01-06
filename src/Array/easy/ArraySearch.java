package Array.easy;

public class ArraySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4}; int x = 9;

        int search = search(arr, x);
        System.out.println(search);

    }
    static int search(int arr[], int x) {
        // Your code here
        int n = arr.length;;
        for (int i=0;i<n;i++){
            if (arr[i]==x) return i;

        }

        return -1;

    }

}
