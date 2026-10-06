public class Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int sum = 0;

        System.out.print("Output: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i == 0) {
                System.out.print(sum);
            } else {
                System.out.print(", " + sum);
            }
        }
    }
}

