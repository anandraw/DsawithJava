package Array.medium;

 class LSubArrWithSum {
    public static void main(String[] args) {
        int[] a ={2,3,5,1,9};
        long k=10;
        int len = getlongestSubArray(a,k);
        System.out.println(len);

    }
    static int getlongestSubArray(int[]a, long k){
        int len=0;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j <a.length ; j++) {
                sum+=a[j];
                if (sum==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
