package SearchingAndSorting.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element) {

        int start = 0;
        int end = arr.length - 1;
        int mid = end / 1;
        while (start <= end) {
            mid = (start+end)/2;
            if (arr[mid] > element) {
                end = mid - 1;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 10, 14, 17};
        int target = 609;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
}
