package String.easy;

public class CocateTwoString {
    public static void main(String[] args) {

        String str1 = "Anand";
        String str2 = "Rawool";

        // result=
        StringBuilder str = new StringBuilder();

        int len = Math.max(str1.length(),str2.length());

        for (int i = 0; i < len; i++) {
            if (i < str1.length()) {
                str.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                str.append(str2.charAt(i));
            }
        }

        System.out.println(str.toString());

    }

}
