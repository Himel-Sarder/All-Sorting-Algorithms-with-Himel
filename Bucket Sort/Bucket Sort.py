def bucket_sort(arr):
    bucket = [[] for _ in range(len(arr))]
    for num in arr:
        index = int(len(arr) * num)
        bucket[index].append(num)
    for i in range(len(arr)):
        bucket[i].sort()
    return [num for sublist in bucket for num in sublist]
