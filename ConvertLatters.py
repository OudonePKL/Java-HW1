# Convert uppercase letters to lowercase letters and 
# lowercase letters to uppercase letters.

# @author: Oudodne

q = ["H","e","l","l","o","W","o","r","l","D"]
a = []
def changeText(q):
    
    [a.append(i.lower()) 
    if not i.islower() 
    else a.append(i) for i in q]

    for i in q:
        print(i, end='')
    print()
    for i in a:
        print(i, end='')
        


changeText(q)


# ------------------Not yet---------------------
