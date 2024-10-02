def counting_sort(arr):
    max_val = max(arr)
    count = [0] * (max_val + 1)
    output = [0] * len(arr)
    for i in arr:
        count[i] += 1
    for i in range(1, max_val + 1):
        count[i] += count[i - 1]
    for i in reversed(arr):
        output[count[i] - 1] = i
        count[i] -= 1
    return output
