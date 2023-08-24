public class BinarySearch {
    public static void main(String[] args) {
        int[] A = new int[]{-1, 0, 1, 2, 3, 4, 7, 9, 10, 20};
        System.out.println(divideAndConquered(A, 0, A.length - 1, 0));
    }

    public static int divideAndConquered(int[] arr, int left, int right, int target) {
        if (left > right) return -1;
        int mid = ((left + right) / 2);
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) return divideAndConquered(arr, left, mid - 1, target);
        return divideAndConquered(arr, mid + 1, right, target);
    }
}
