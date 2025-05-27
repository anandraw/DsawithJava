package Greedy;

import java.util.HashMap;
import java.util.Map;

//2244
public class MinimumRoundsToCompleteAllTasks {
    public static void main(String[] args) {
       int[] tasks = {2,2,3,3,2,4,4,4,4,4};
        int round = minimumRounds(tasks);
        System.out.println(round);
    }
    static int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num:tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int rounds =0;

      for (int count:map.values()){
          if (count==1){
              return -1;
          }
          if (count % 3 == 0) {
              rounds += count / 3;
          } else {
              rounds += count / 3 + 1;
          }
      }
      return rounds;
    }
}
