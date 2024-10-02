void bucketSort(float[] arr) {
    int n = arr.length;
    ArrayList<Float>[] buckets = new ArrayList[n];
    for (int i = 0; i < n; i++) buckets[i] = new ArrayList<>();
    for (float num : arr) {
        int index = (int)(num * n);
        buckets[index].add(num);
    }
    for (ArrayList<Float> bucket : buckets) Collections.sort(bucket);
    int index = 0;
    for (ArrayList<Float> bucket : buckets)
        for (float num : bucket) arr[index++] = num;
}
