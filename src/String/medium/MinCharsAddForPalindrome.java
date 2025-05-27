package String.medium;

public class MinCharsAddForPalindrome {
    public static void main(String[] args) {
          String s ="abc";
          int ans = minChar(s);
          System.out.println(ans);

    }
    public static int minChar(String s) {
//        int cnt = 0;
//        int i = s.length() - 1;
//
//        while (i >= 0 && !isPalindrome(s, 0, i)) {
//
//            i--;
//            cnt++;
//        }
//
//        return cnt;
//    }
//
//    private static boolean isPalindrome(String s, int i, int j) {
//        while (i < j) {
//
//            if (s.charAt(i) != s.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;




        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        s=s+"$"+rev;
        int[] lps=computeLPS(s);
        return(n-lps[lps.length-1]);
    }

    static int[] computeLPS(String pat){

        int n=pat.length();
        int[] lps=new int[n];
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<n){
            if(pat.charAt(i) ==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}
