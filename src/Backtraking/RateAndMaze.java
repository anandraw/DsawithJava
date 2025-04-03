package Backtraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RateAndMaze {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(java.util.Arrays.asList(1,1,0,0,1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(1,1,1,1,0)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(1,1,1,0,1)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(0,0,1,0,0)));
        mat.add(new ArrayList<>(java.util.Arrays.asList(1,1,1,1,1)));

        ArrayList<String> paths =findPath(mat);
        System.out.println("Paths: "+paths);
    }
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        //control+recursion
        ArrayList<String> ans = new ArrayList<>();
        int n = mat.size();

        // cover edge case (if start ans end is bloack so we cant move or nither finish)
        if (mat.get(0).get(0)==0 || mat.get(n-1).get(n-1)==0){
            return ans;
        }
        boolean[][] visited = new boolean[n][n]; // To track visited cells
        solve(mat,0,0,"",ans,visited);
        return ans;
    }

    private static void solve(ArrayList<ArrayList<Integer>> mat, int i, int j, String move,
                              ArrayList<String> ans, boolean[][] visited) {
        int n = mat.size();

        //edge case
        if (i==n-1 && j==n-1) {
            ans.add(move);
            return;
        }

        // boundry check
        if (i<0 || i>=n || j<0 || j>=n || mat.get(i).get(j)==0||visited[i][j]){
            return;
        }
        visited[i][j]=true;

        //move down
        solve(mat,i+1,j,move+"D",ans,visited);

        //move move right
        solve(mat,i,j+1,move+"R",ans,visited);

        //move left
        solve(mat,i,j-1,move+"L",ans,visited);

        //move up
        solve(mat,i-1,j,move+"U",ans,visited);

        //backtrack
        visited[i][j]=false;


    }
}

