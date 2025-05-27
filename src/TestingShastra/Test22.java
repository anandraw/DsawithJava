package TestingShastra;

import java.util.ArrayList;

public class Test22 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 1, 4, 15, 16}};
        ArrayList<Integer> list = spirallyTraverse(mat);
        System.out.println(list);

    }

    static ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        if (mat == null || mat.length == 0) return result;

        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = 0;

        // Find the maximum row length to set right boundary
        for (int[] row : mat) {
            right = Math.max(right, row.length - 1);
        }

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right (top row)
            for (int i = left; i <= right && top <= bottom; i++) {
                if (top < mat.length && i < mat[top].length) {
                    result.add(mat[top][i]);
                }
            }
            top++;

            // Traverse from Top to Bottom (right column)
            for (int i = top; i <= bottom && left <= right; i++) {
                if (i < mat.length && right < mat[i].length) {
                    result.add(mat[i][right]);
                }
            }
            right--;

            // Traverse from Right to Left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left && top <= bottom; i--) {
                    if (bottom < mat.length && i >= 0 && i < mat[bottom].length) {
                        result.add(mat[bottom][i]);
                    }
                }
                bottom--;
            }

            // Traverse from Bottom to Top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top && left <= right; i--) {
                    if (i >= 0 && i < mat.length && left < mat[i].length) {
                        result.add(mat[i][left]);
                    }
                }
                left++;
            }
        }
        return result;

    }
}
