package BinarySearch;

import static BinarySearch.FindCeilInArray.findCeil;
import static BinarySearch.FloorInSortdArray.findFloor;

public class UpperAndLowerBound {
    public static void main(String[] args) {

       int x = 7 , arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int[] floorAndCeil = getFloorAndCeil(x, arr);
        for (int um:floorAndCeil){
            System.out.print(um+" ");
        }
    }
    public static int[] getFloorAndCeil(int x, int[] arr) {

        int n = arr.length;
        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);

        return new int[]{floor, ceil};
    }
}
