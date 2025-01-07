package Array.easy;

public class FindFine {
    public static void main(String[] args) {
       int date = 12;
       int car[] = {2375, 7682, 2325, 2352};
       int fine[] = {250, 500, 350, 200};

        long l = totalFine(date, car, fine);
        System.out.println(l);


    }
    public static long totalFine(int date, int car[], int fine[]) {
        // code here
        long totalfine=0;
        if (date%2==0){
            for (int i = 0; i < car.length; i++) {
                if (car[i]%2!=0){
                    totalfine+=fine[i];
                }
            }
        }else{
            for (int i = 0; i < car.length; i++) {
                if (car[i]%2==0){
                    totalfine+=fine[i];
                }
            }
        }
        return totalfine;
    }
}
