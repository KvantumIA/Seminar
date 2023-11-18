def sum_imperative(n):
    total = 0
    for i in range(1, n+1):
        total += i
    return total

result = sum_imperative(5)
print(result) # Вывод: 15



def sum_declarative(n):
    return sum(range(1, n+1))

result = sum_declarative(5)
print(result) # Вывод: 15