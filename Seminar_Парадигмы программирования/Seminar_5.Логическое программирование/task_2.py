# Задача: Напишем программу, которая проверяет, является ли заданное слово палиндромом.

str=input("Введите слово: ")
if str==str[::-1]:
    print("Полиндром")
else:
    print("НЕ полиндром")

#-------------------------------------------------

# Мы хотим подсчитать частоту встречаемости каждого слова в этом тексте.

str="Python is a powerful programming a language. Python is used for a web development, data a analysis, machine is learning, and more."
str.lower()
str=str.replace(".","")
str=str.replace(",","")
sp=str.split()

lib={}
for i in sp:
    if i in lib:
        lib[i]+=1
    else:
        lib[i]=1
# print (lib)

lib2 = sorted(lib.items(), key=lambda item: item[1],reverse=True)
print (lib2)

#-------------------------------------------------

# Задача: Напишем программу, которая анализирует текст, определяет наиболее часто встречающиеся 
# биграммы (пары последовательных слов) в нем.

# Мы хотим найти топ N наиболее часто встречающихся биграмм в этом тексте

str = "Machine learning is a subfield of artificial intelligence that focuses on the interaction \
 between computers and humans. Machine learning involves the use of algorithms and statistical \
 models to enable computers to perform tasks without explicit programming. In machine learning, \
 data plays a crucial role. Data is used to train the algorithms and improve their performance \
 over time. Machine learning has applications in various fields, including natural language processing, \
 image recognition, and autonomous vehicles."

# Приводим текст к нижнему регистру"
str = str.lower()

# Убираем точки и запятые
str = str.replace(".", "")
str = str.replace(",", "")

# Разбиваем текст на слова
sp = str.split()

# Создаем словарь для хранения пар слов и их количества
lib = {}

# Проходим по списку слов с шагом 1, чтобы формировать биграммы
for i in range(len(sp) - 1):

# Формируем биграмму из текущего слова и следующего слова
    word_pair = (sp[i], sp[i + 1])

# Если биграмма уже есть в словаре, увеличиваем счетчик
    if word_pair in lib:    
        lib[word_pair] += 1
    else:
            
# Если биграммы нет в словаре, добавляем ее и устанавливаем счетчик в 1
            lib[word_pair] = 1

# Сортируем словарь по значению (количеству повторений) в обратном порядке
lib2 = sorted(lib.items(), key=lambda item: item[1], reverse=True)

# Выводим отсортированный список биграмм и их количества
print(lib2)