# Последовательностью Фибоначчи называется последовательность чисел a0, a1 , ..., an, ..., 
# где a0 = 0, a1  = 1, ak = ak-1 + ak-2 (k > 1).

# Требуется найти N-е число Фибоначчи

# Input: 7
# Output: 21


def Fibon(num):
    if num <= 1:
        return 1
    return Fibon(num - 1) + Fibon(num - 2)


num = 5

print('Список фибоначчи')
for i in range(1, num+1):
    print(Fibon(i), end = ' ')
print()
print('Найден последний элемент под номером', num, '=', Fibon(num))