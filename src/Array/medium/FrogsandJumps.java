package Array.medium;

import java.util.HashSet;

public class FrogsandJumps {
    public static void main(String[] args) {
        int N = 3;
        int leaves = 6;
        int frogs[] = {1,3,5};
        int r = unvisitedLeaves(N,leaves,frogs);
        System.out.println(r);

    }
    public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
//        HashSet<Integer> visited = new HashSet<>();
//
//        for (int i = 0; i < N; i++) {
//            int cuurFrog=frogs[i];
//
//            if (cuurFrog>leaves) continue;
//
//            for (int j = cuurFrog; j <=leaves ; j+=cuurFrog) {
//                 visited.add(j);
//            }
//
//        }
//        return leaves-visited.size();
        int unVisited = 0;
        boolean[] visit = new boolean[leaves+1];

        for(int i=0; i<N; i++){
            int currPos = frogs[i];
            if(currPos <= leaves && !visit[currPos]) {
                for(int j=currPos; j<=leaves; j+=currPos){
                    visit[j] = true;
                }
            }
        }
        for(int i=1; i<=leaves; i++){
            if(!visit[i]) unVisited++;
        }
        return unVisited;

    }
}
