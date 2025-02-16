package String.medium;

import java.util.HashMap;

public class TransformString {
    public static void main(String[] args) {
       String A = "abc";
       String B = "efg";
       int result =transform(A,B);
        System.out.println(result);

    }
     static  int transform (String A, String B)
    {
//        HashMap<Character,Integer> map1 =new HashMap<>();
//        HashMap<Character,Integer> map2 =new HashMap<>();
//
//        // check length of both string
//        if(A.length()!=B.length()) return -1;
//
//        //convet both string into chararray
//        char[] chA = A.toCharArray();
//        char[] chB = B.toCharArray();
//
//        for (char ch:chA){
//            map1.put(ch, map1.getOrDefault(ch,0)+1);
//        }
//        for (char ch:chB){
//            map1.put(ch, map1.getOrDefault(ch,0)+1);
//        }
//        if (!map1.equals(map2)) return -1;
//
//        int cnt=0;
//        int i = A.length()-1;
//        int j= B.length()-1;
//        while(i>=0&&j>=0){
//            if (A.charAt(i)==B.charAt(j)){
//                i--;
//                j--;
//            }else{
//                cnt++;
//                i--;
//            }
//        }
//        return cnt;

        if(A.length()!=B.length())return -1;

        HashMap<Character, Integer> hm= new HashMap<>();

        for(int i=0;i<A.length();i++){
            hm.put(A.charAt(i),hm.getOrDefault(A.charAt(i),0)+1);
            hm.put(B.charAt(i),hm.getOrDefault(B.charAt(i),0)-1);
        }

        for(int c:hm.values()){
            if(c!=0)return -1;
        }

        int i=A.length()-1;
        int j=B.length()-1;

        int ans=0;
        while(i>=0 && j>=0){
            if(A.charAt(i)==B.charAt(j)){
                i--;j--;
            }
            else{
                ans+=1;
                i-=1;
            }

        }
        return ans;
    }
}
