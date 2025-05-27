package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpirallyTraversingMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4, 5, 6}, { 7, 8, 9, 10, 11, 12}, {13, 14, 15, 16,17,18}};
        List<Integer> res = spirallyTraverse(mat);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
    public static ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        int top = 0, bottom = rows - 1,left = 0, right = cols - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right (Top row)
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;

            // Traverse from Top to Bottom (Right column)
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            // Traverse from Right to Left (Bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Traverse from Bottom to Top (Left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
