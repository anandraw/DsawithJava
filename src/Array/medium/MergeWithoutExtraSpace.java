package Array.medium;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
       int  a[] = {2, 4, 7, 10}, b[] = {2, 3};
        mergeArrays(a, b);

        for (int ele : a)
            System.out.print(ele + " ");
        System.out.println();
        for (int ele : b)
            System.out.print(ele + " ");
    }
    static void mergeArrays(int a[], int b[]) {
//        int n = a.length, m=b.length;
//
//        for (int i = m-1; i>=0 ; i--) {
//            if (a[n-1]>b[i]){
//                int last = a[n-1];
//                int ptr = n-2;
//                while (ptr>=0 && a[ptr]>b[i]){
//                    a[ptr+1]=a[ptr];
//                    ptr--;
//                }
//                a[ptr+1]=b[i];
//                b[i]=last;
//            }
//        }

        int n = a.length;
        int m = b.length;
        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < n + m) {

                // If both pointers are in the first array a[]
                if (j < n && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                // If first pointer is in a[] and
                // the second pointer is in b[]
                else if (i < n && j >= n && a[i] > b[j - n]) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                }

                // Both pointers are in the second array b
                else if (i >= n && b[i - n] > b[j - n]) {
                    int temp = b[i - n];
                    b[i - n] = b[j - n];
                    b[j - n] = temp;
                }
                i++;
                j++;
            }

            // After operating for gap of 1 break the loop
            if (gap == 1) break;

            // Calculate the next gap
            gap = (gap + 1) / 2;
        }
    }
}
