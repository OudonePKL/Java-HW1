#  Program to convert decimal number to binary number

# @author: Oudone PKL

# Create a function
def decimalToBinary(num):
    if num >= 1:
        # recursive function call
        decimalToBinary(num // 2)

        # printing remainder from each function call
        print(num % 2, end= '')



# input data
num = int(input("Enter decimal number: "))

# call function
decimalToBinary(num)
