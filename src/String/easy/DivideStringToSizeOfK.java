package String.easy;

public class DivideStringToSizeOfK {
    public static void main(String[] args) {
        String s = "abcdefghi";int  k = 3; char fill = 'x';
        String[] arr =divideString(s,k,fill);
        for (String re :arr){
            System.out.print(re+" ");
        }
    }
    public static String[] divideString(String s, int k, char fill) {
        int groups=(s.length()+k-1)/k;
        String[] result=new String[groups];

        for (int i = 0; i <groups ; i++) {
            int start=i*k;
            int end=Math.min(start+k,s.length());
            StringBuilder grops = new StringBuilder(s.substring(start,end));

            while (grops.length()<k){
                grops.append(fill);
            }
            result[i]=grops.toString();
        }
        return result;
    }
}
