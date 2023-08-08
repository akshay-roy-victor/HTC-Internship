def square(n):
    return n*n

def summation(l):
    x=0
    for number in l:
        x+=number
    return x

def length(l):
    x=0
    for num in l:
        x+=1
    return x

def mean(l):
    return summation(l)/length(l)

def sqrt(n):
    return n**(0.5)

def sumdiff(l):
    lst = []
    for num in l:
        lst.append(square(num-mean(l)))
    return lst   

def var(l):
    return summation(sumdiff(l))/length(l)

def sd(l):
    return sqrt(var(l))

list = [82, 93, 98, 89, 88]
print(sd(list))


