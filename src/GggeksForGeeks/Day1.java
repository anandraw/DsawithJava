package GggeksForGeeks;


//Q:Second Largest
public class Day1 {
        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};
            int result = getSecondLargest(arr);
            System.out.println(result);
        }
    public static int getSecondLargest(int[] arr) {
        // Code Here

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
