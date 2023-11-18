# Дан список чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается, что любые
# два элемента, равные друг другу образуют одну пару, которую необходимо посчитать. Вводится список
# чисел. Все числа списка находятся на разных строках.

# Ввод:     Вывод:
# 1 2 3     2 3 2


def search_dbl(start_list):
    count = 0
    for i in range(len(start_list) - 1):
        for j in range(i+1, len(start_list)):
            if start_list[i] == start_list[j]:
                count += 1
    return count

start_list = [1, 2, 1, 2, 2, 3, 4]
print(search_dbl(start_list))

#----------------------------------------

count = 0
for i in range(len(start_list)-1):
    count +=  start_list[i+1:].count(start_list[i])
print(count)