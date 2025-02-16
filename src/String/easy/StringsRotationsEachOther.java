package String.easy;

public class StringsRotationsEachOther {
    public static void main(String[] args) {
       String  s1 = "abcd"; String s2 = "cdab";
        boolean b = areRotations(s1, s2);
        System.out.println(b);
    }
    public static boolean areRotations(String s1, String s2) {
        s1=s1+s1;
        return s1.lastIndexOf(s2)>=0;
    }
}

