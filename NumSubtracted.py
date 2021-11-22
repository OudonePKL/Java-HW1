# Take a nature less than 100, write down the number subtracted from 100,
# then write down the value subtracted from the previous numjber,
# and execute until the result is negative.

# @author: Oudone PKL

# create the function
def subtractedNumber(num): 
    result = [100] 
    defult = 100 

    if num < 100:
        while True:
            result.append(num) 
            if num < 0:
                break
            x = defult - num 
            defult = num
            num = x
        print("Result: ", result)

    else:
        print("Error!")

# input valu
num = int(input("Input: "))

# call the function
subtractedNumber(num)
