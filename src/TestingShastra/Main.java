package TestingShastra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={4,2,3,1};
        Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println();
        bubleSort(arr);
       for (int num : arr){
           System.out.print(num+" ");
       }
        System.out.println();
       selectionSort(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
    static void bubleSort(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }
    static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                if (arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
