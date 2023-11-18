// Задача 37: Найдите произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент, второй и предпоследний и т.д. Результат запишите в новом массиве.
// [1 2 3 4 5] -> 5 8 3
// [6 7 3 6] -> 36 21


void FillArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-100, 101);
    }
}



void PrintArray(int[] array)
{
    foreach (var item in array)
    {
        System.Console.Write($"{item} ");
    }
    System.Console.WriteLine();
}



void ProizArray (int[] array, int[] arrayProiz)
{
    int size = array.Length/2;
    for (int i = 0; i < size; i++)
    {
        arrayProiz[i] = array[i] * array[array.Length-1-i];
    }
    if (size%2==1)
        arrayProiz[arrayProiz.Length-1] = array[array.Length/2];
    System.Console.WriteLine();
}




Console.Clear();
System.Console.Write("Введите диапазон массива: ");
int size = Convert.ToInt32(System.Console.ReadLine());

int[] array = new int[size];
int[] arrayProiz = new int[size/2 + size%2];

FillArray(array);
System.Console.Write($"Массив: ");
PrintArray(array);
ProizArray(array, arrayProiz);
System.Console.Write($"Произведение массива: ");
PrintArray(arrayProiz);