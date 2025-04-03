package SlidingWindow;

public class MaximizeConfusionOfExam {
    public static void main(String[] args) {
        String answerKey = "TTFF"; int k = 1;
        int ans = maxConsecutiveAnswers(answerKey, k);
        System.out.println(ans);
    }
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int result = 0;

        // First pass: maximize 'T' by flipping 'F'
        int i = 0, j = 0, countF = 0;
        while (j < n) {
            if (answerKey.charAt(j) == 'F')
                countF++;

            while (countF > k) {
                if (answerKey.charAt(i) == 'F')
                    countF--;
                i++;
            }
            result = Math.max(result, j - i + 1);
            j++;
        }

        // Second pass: maximize 'F' by flipping 'T'
        int a = 0, b = 0, countT = 0;
        while (b < n) {
            if (answerKey.charAt(b) == 'T')
                countT++;

            while (countT > k) {
                if (answerKey.charAt(a) == 'T')
                    countT--;
                a++;
            }

            result = Math.max(result, b - a + 1);
            b++;
        }
        return result;
    }
}
