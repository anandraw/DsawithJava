package Greedy;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
       int[] people={2,4,6,9}; int limit=10;
        int ans = numRescueBoats(people,limit);
        System.out.println(ans);

    }
    public static int numRescueBoats(int[] people, int limit) {
       int n = people.length;
       int i=0,j=n-1,boats=0;
        Arrays.sort(people);

       while (i<=j){
           if(people[i]+people[j]<=limit){
               i++;
           }
           j--;
           boats++;
       }
       return boats;
    }
}
