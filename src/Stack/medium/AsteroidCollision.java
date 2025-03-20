package Stack.medium;

import java.util.ArrayDeque;

public class AsteroidCollision {
    public static void main(String[] args) {
        int n =3;
        int[] arstroids={3,5,-3};
        int[] ints = asteroidCollision(n, arstroids);
        for (int ele : ints){
            System.out.print(ele+" ");
        }

    }
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        if (asteroids == null || asteroids.length == 0)
            return new int[0];

        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int ele : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && st.peek() > 0 && ele < 0) { // Collision happens only when opposite signs
                int top = st.peek();
                if (top > Math.abs(ele)) { // Top asteroid is larger, current one is destroyed
                    destroyed = true;
                    break;
                } else if (top == Math.abs(ele)) { // Both asteroids destroy each other
                    st.pop();
                    destroyed = true;
                    break;
                } else { // Top asteroid is smaller, remove it and continue checking
                    st.pop();
                }
            }
            if (!destroyed) {
                st.push(ele);
            }
        }
        // Convert stack to array in correct order
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
