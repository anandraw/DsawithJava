package BinarySearch;

public class FirstAndLastOccurrenceBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6};
        int target = 4;
        int firstIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);

        System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
        System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    
}
