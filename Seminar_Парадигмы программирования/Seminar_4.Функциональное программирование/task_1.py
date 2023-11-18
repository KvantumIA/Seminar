def square(x):
    return x * x

# Присвоение функции square переменной func
func = square

# Теперь переменная func содержит функцию square
result = func(5)
print(result) # Вывод: 25   

#--------------------------------------------------

def apply_function(func, x):
    return func(x)

def double(x):
    return x * 2

def triple(x):
    return x * 3

result1 = apply_function(double, 5)
result2 = apply_function(triple, 5)

print(result1) # Вывод: 10
print(result2) # Вывод: 15

#--------------------------------------------------

def create_multiplier(factor):
    def multiplier(x):
        return x * factor
    return multiplier

double = create_multiplier(2)
triple = create_multiplier(3)

result1 = double(5)
result2 = triple(5)

print(result1) # Вывод: 10
print(result2) # Вывод: 15

#--------------------------------------------------

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

function_list = [add, subtract]

result1 = function_list[0](5, 3)
result2 = function_list[1](10, 4)

print(result1) # Вывод: 8
print(result2) # Вывод: 6