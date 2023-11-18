// Задача 35: Задайте одномерный массив из 15 случайных чисел от -100 до 100. Найдите количество элементов массива, значения которых лежат в отрезке [10,99]. 
// Пример для массива из 5, а не 15 элементов. В своём решении сделайте для 15
// [5, 18, 123, 6, 2] -> 1
// [1, 2, 3, 6, 2] -> 0
// [10, 11, 12, 13, 14] -> 5


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


void FindArray(int[] array)
{
    int Count = 0;
    foreach (var item in array)
    {
        if (item>=10 && item<=99)
            Count++;
    }
    System.Console.WriteLine(Count);
}




int[] array = new int[15];
FillArray(array);
PrintArray(array);
FindArray(array);