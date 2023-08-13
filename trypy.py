# values = input("enter values")
# list = values.split(",")
# tupl = tuple(list)
# print(list)
# print(tupl)
# print(list[0])
# print(list[len(list)-1])


# filename = input("Input the Filename: ")
# f_extns = filename.split(".")
# print ("The extension of the file is : " + f_extns[-1])


# li = ['11','12','2014']
# a = "/".join(li)
# print(a)


# import re
# text = 'how are you?'
# matched = re.match(r'(.+)',text)
# print(matched.group())


# import calendar
# y = int(input())
# m = int(input())
# print(calendar.month(y,m))


# from datetime import date
# f_date = date(2014, 3, 30)
# l_date = date(2014, 4, 21)
# delta = l_date - f_date
# print(delta.days)


# print(abs(-20))


def outer(msg):
    print(msg)
    print(id(msg))
    def inner():
        nonlocal msg
        msg = "inner funct"
        print(msg)
        print(id(msg))
    inner()
    print(msg)
    print(id(msg))
    nonlocal msg

msg = "this is funct"
print(msg)
print(id(msg))
outer(msg)
print(msg)

#   asignment phase 1 string   1   11  13  17   19  20  22  23  26  28  29
#   31  32  35  36  41  42  43  44  45  46  47  48  49  50


L = [13, 0, 35, 0, 97]

i = 0
for j in range(len(L)):
    if L[j] != 0:
        L[i] = L[j]
        i += 1
    print(L)

for j in range(i,len(L)):
    L[j] = 0
print(L)


# 0   to   5
# 0  1  2  3  4
#                 indx    i
# 1  0  1  0  1  - 0      0
# 1  1  1  0  1  - 1      1
# 1  1  1  0  1  - 2      1
# 1  1  1  1  1  - 3      2
# 1  1  1  1  1  - 4      2




# 12  3   6   1   6   9 12