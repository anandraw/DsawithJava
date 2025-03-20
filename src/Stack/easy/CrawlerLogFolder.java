package Stack.easy;

import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
       // int ans = minOperations(logs);
        int ans = minDepth(logs);
        System.out.println(ans);

    }

    static int minOperations(String[] logs) {

        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!log.equals("./")) {
                stack.push(log);
            }
        }
        return stack.size();
    }

    static int minDepth(String[] logs){
        int depth = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                depth--;
            } else if (!log.equals("./")) {
                depth++;
            }
        }
        return depth;
    }
}
