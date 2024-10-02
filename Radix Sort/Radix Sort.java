int getMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
    return max;
}

void countSort(int[] arr, int exp) {
    int[] output = new int[arr.length];
    int[] count = new int[10];
    for (int i = 0; i < arr.length; i++) count[(arr[i] / exp) % 10]++;
    for (int i = 1; i < 10; i++) count[i] += count[i - 1];
    for (int i = arr.length - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }
    for (int i = 0; i < arr.length; i++) arr[i] = output[i];
}

void radixSort(int[] arr) {
    int m = getMax(arr);
    for (int exp = 1; m / exp > 0; exp *= 10) countSort(arr, exp);
}
