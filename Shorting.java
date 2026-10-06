public class Shorting {
    // Bubble Sort
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] bubbleArray = {25, 15, 52, 30, 74, 45, 10, 65};
        int[] selectionArray = {25, 15, 52, 30, 74, 45, 10, 65};
        int[] insertionArray = {25, 15, 52, 30, 74, 45, 10, 65};

        bubbleSort(bubbleArray);
        selectionSort(selectionArray);
        insertionSort(insertionArray);

        System.out.print("Bubble Sort: ");
        for (int value : bubbleArray) {
            System.out.print(value + " ");
        }

        System.out.print("\nSelection Sort: ");
        for (int value : selectionArray) {
            System.out.print(value + " ");
        }

        System.out.print("\nInsertion Sort: ");
        for (int value : insertionArray) {
            System.out.print(value + " ");
        }
    }
}