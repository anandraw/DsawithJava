package TestingShastra;

public class Test {

    public static void main(String[] args) {

           int[][] x={{1,2},{3,4,5},{8,9,10}};
           System.out.println(x[2][0]);
           for(int arr[] : x){
               for (int ele:arr){
                   System.out.println(ele);
               }
           }
    }
}
