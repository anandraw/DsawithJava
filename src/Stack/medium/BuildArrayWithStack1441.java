package Stack.medium;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStack1441 {
    public static void main(String[] args) {
        int[] target = {1,3}; int  n = 3;
        List<String> strings = buildArray(target, n);
        System.out.println(strings);
    }
    public  static List<String> buildArray(int[] target, int n) {
          List<String> ans  = new ArrayList<>();
          int targetPointer=0, streamPointer=1;
          while(targetPointer < target.length){
              ans.add("Push");
              if (target[targetPointer]== streamPointer){
                    targetPointer++;
              }else{
                  ans.add("Pop");
              }
              streamPointer++;
          }
          return ans;
    }
}
