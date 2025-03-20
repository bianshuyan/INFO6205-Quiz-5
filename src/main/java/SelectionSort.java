class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // STUDENT TODO
        for (int i = 0; i < n; i++) {
            int m = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[m]) m = j;
            }
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}   
