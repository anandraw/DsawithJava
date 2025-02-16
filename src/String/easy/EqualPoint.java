package String.easy;

public class EqualPoint {
    public static void main(String[] args) {
        String str = "(())))("; // Example input
        System.out.println("Equal Point: " + countSub(str));

    }
    public  static long countSub(String str) {

        if (str == null || str.isEmpty()) {
            return -1;
        }
        int leftCount = 0, rightCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                rightCount++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftCount++;
            } else {
                rightCount--;
            }

            if (leftCount == rightCount) {
                return i + 1;
            }
        }

        return 0;
    }
}
