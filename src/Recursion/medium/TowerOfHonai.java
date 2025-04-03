package Recursion.medium;

public class TowerOfHonai {
    public static void main(String[] args) {
          int n =4;
          int ans = towerOfHanoi(n,1,3,2);
          System.out.println(ans);

    }
    public static int towerOfHanoi(int n, int from, int to, int aux) {

        // base case
        if (n==1){
            System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
            return 1;
        }
        if (n==0){
            return 0;
        }
        int move=0;
        move = towerOfHanoi(n-1,from,aux,to); //form-rod->aux-road with help of to-rod
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        move++; // nth disk
        move+=towerOfHanoi(n-1,aux,to,from); // aux-tod->to-rod with help of form-rod

        return move;

    }
}
