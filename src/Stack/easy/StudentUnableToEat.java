package Stack.easy;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//leetcode:1700
public class StudentUnableToEat {
    public static void main(String[] args) {
        int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
        int ans = countStudents(students,sandwiches);
        System.out.println(ans);
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Queue<Integer> studentQueue = new ArrayDeque<>();
        Stack<Integer> sandwichStack = new Stack<>();

        for (int student : students) {
            studentQueue.add(student);
        }
        for (int i = n - 1; i >= 0; i--) {
            sandwichStack.push(sandwiches[i]);
        }

        int ans = 0;
        while (!studentQueue.isEmpty()) {
            if (studentQueue.peek().equals(sandwichStack.peek())) {
                studentQueue.poll();
                sandwichStack.pop();
                ans = 0;
            } else {
                studentQueue.add(studentQueue.poll());
                ans++;
                if (ans == studentQueue.size()) break;
            }
        }
        return ans;
    }

    public static int countStudentsOpimal(int[] students, int[] sandwiches) {
        int count0 = 0, count1 = 0; // Count of students preferring 0 and 1

        for (int student : students) {
            if (student == 0) count0++;
            else count1++;
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0 && count0 > 0) count0--;
            else if (sandwich == 1 && count1 > 0) count1--;
            else break; // No student left to eat this sandwich
        }

        return count0 + count1; // Remaining students who couldn't eat
    }
}
