void countingSort(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
    int[] count = new int[max + 1];
    int[] output = new int[arr.length];
    for (int i : arr) count[i]++;
    for (int i = 1; i <= max; i++) count[i] += count[i - 1];
    for (int i = arr.length - 1; i >= 0; i--) {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }
    for (int i = 0; i < arr.length; i++) arr[i] = output[i];
}
