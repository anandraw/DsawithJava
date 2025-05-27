package String.easy;

public class UnqueSting {
    public static void main(String[] args) {

        String str="Anand";
        String ans=" ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && ch == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                ans = ans + ch;
            }
        }
        System.out.println(ans);
    }
}
