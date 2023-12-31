# Напишите программу, которая принимает на вход строку, и отслеживает, сколько раз каждый символ
# уже встречался. Количество повторов добавляется к символам с помощью постфикса формата _n.

# Input: a a a b c a a d c d d
# Output: a a_1 a_2 b c a_3 a_4 d c_1 d_1 d_2

# Для решения данной задачи используйте функцию
# .split()

my_string = 'a a a b c a a d c d d'

my_list = my_string.split()
print(my_list)
my_dict = {}

for i in my_list:
    if i not in my_dict:
        my_dict[i] = 0
        print(i+' ',end='')
    else:
        print(i,end='')
        my_dict[i] += 1
        print('_' + str(my_dict[i]) +' ',end='')