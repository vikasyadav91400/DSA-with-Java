public class Quick_sort {
    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int j = start -1;

        for (int i = start; i < end; i++){
            if (arr[i] < pivot) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[j];
        arr[j] = arr[end];
        arr[end] = temp;

        return j;
    }
    
}
