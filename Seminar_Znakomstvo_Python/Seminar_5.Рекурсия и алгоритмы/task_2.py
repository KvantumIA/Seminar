# Хакер Василий получил доступ к классному журналу и
# хочет заменить все свои минимальные оценки на
# максимальные. Напишите программу, которая
# заменяет оценки Василия, но наоборот: все
# максимальные – на минимальные.

# Input: 5 -> 1 3 3 3 4
# Output: 1 3 3 3 1

def Func(n):                        # 1й вариант
    maxx = max(n)
    minn = min(n)
    for i in range(len(n)):
        if n[i] == maxx:
            n[i] = minn
    return(n)

n = [1, 3, 3, 3, 4]

print(Func(n))

#-------------------------------------

m = list(map(int, input().split()))    # 2й вариант с вводом цифр с клавиатуры

def func(m):
    maxx = max(m)
    minn = min(m)
    for i in range(len(m)):
        if m[i] == maxx:
            m[i] = minn
    return m

print(func(m))