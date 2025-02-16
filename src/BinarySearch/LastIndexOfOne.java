package BinarySearch;

public class LastIndexOfOne {
    public static void main(String[] args) {
        String s = "1100";
        int e = lastIndex(s);
        System.out.println(e);

    }

    public static int lastIndex(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '1'&& ch[i+1]=='0') {
                return i;
            }
        }
        return -1;    }
}