public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-5, 20, 10, 3, 2, 0};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, 0, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= end) temp[k++] = arr[j++];
        for (i = start; i <= end; i++) arr[i] = temp[i - start];
    }

}
