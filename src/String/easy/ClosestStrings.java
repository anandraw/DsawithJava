package String.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestStrings {
    public static void main(String[] args) {

        List<String> s = Arrays.asList("jd", "lzt", "kym", "ky", "gdf", "gdf", "jd");
        String word1 = "kym";
        String word2 = "gdf";

        // Convert List to ArrayList to pass into the function
        ArrayList<String> sList = new ArrayList<>(s);

        System.out.println("Shortest Distance: " + shortestDistance(sList, word1, word2));
    }
    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int shortest = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;

        for(int i=0;i<s.size();i++){
            String str = s.get(i);

            if(str.equals(word1)){
                index1 = i;
            }

            if(str.equals(word2)){
                index2  = i;
            }

            if(index1 != -1 && index2 != -1){
                int distance = Math.abs(index1 - index2);
                shortest = distance < shortest ? distance : shortest;
            }
        }
        return shortest;
    }
}
