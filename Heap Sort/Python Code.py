def findRelativeRanks(score):
    sorted_score = sorted(score, reverse=True)
    rank_map = {1: "Gold Medal", 2: "Silver Medal", 3: "Bronze Medal"}
    result = []

    for s in score:
        rank = sorted_score.index(s) + 1
        if rank in rank_map:
            result.append(rank_map[rank])
        else:
            result.append(str(rank))
    
    return result

# Test cases
score1 = [5, 4, 3, 2, 1]
score2 = [10, 3, 8, 9, 4]
print(findRelativeRanks(score1))  # Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
print(findRelativeRanks(score2))  # Output: ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
