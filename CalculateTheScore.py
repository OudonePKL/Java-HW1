# Each competitor received a score from the judges. 
# Calculate the average value after 
# subtracting the highest and lowest scores.

# @author: OudonePKL

scores = [87,45,33,72,87,92,88,76]

# Creat the function
def calculateScore(scores):
    summation = 0

    for i in scores:
        if i == min(scores):
            continue
        if i == max(scores):
            continue
        summation += i

    print(scores, "== result", (summation / 6), "==>", (summation // 6))


# call the function
calculateScore(scores)