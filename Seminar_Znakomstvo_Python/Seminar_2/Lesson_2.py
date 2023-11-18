# Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является, 
# то есть выведите такое число n, что φ(n)=A. Если А не является числом Фибоначчи, выведите число -1.

# Input: 5

# Output: 6

# 0 1 1 2 3 5 8 13 21 34 55 89
# 1 2 3 4 5 6 7 8  9  10 11 12

# fibon = int(input('Введите число: '))

# count = 2
# summa = 1
# temp = 0

# while summa < fibon:
#     summa = summa + temp
#     temp = summa - temp
#     count += 1

# if summa == fibon:
#     print(count)
# else: print('-1')


a = int(input())

i = 2
fib_1 = 0
fib_2 = 1

while fib_2 < a:
    fib_1, fib_2 = fib_2, fib_1 + fib_2

    # buff = fib_2
    # fib_2 = fib_1 + fib_2
    # fib_1 = buff

    i += 1

if fib_2 == a:
    print(i)
else:
    print(-1)