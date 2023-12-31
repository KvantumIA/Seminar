﻿// Задача 57: Составить частотный словарь элементов двумерного массива. Частотный словарь содержит 
// информацию о том, сколько раз встречается элемент входных данных.

// 1, 2, 3 
// 4, 6, 1 
// 2, 1, 6

// 1 встречается 3 раза 
// 2 встречается 2 раз 
// 3 встречается 1 раз 
// 4 встречается 1 раз 
// 6 встречается 2 раза


void FillArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
        for (int j = 0; j < array.GetLength(1); j++)
            array[i,j] = new Random().Next(0,10);
}

void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
        {
        for (int j = 0; j < array.GetLength(1); j++)
            Console.Write($"{array[i,j],3}    ");
        System.Console.WriteLine();
        }
}

int[] frequencyArray(int[] temp)
{
    int[] count = new int[temp.Length];
    for (int i = 0; i < temp.Length; i++)
    {
        for (int j = 0; j < temp.Length; j++)
        {
            if (temp[i] == temp[j])
                count[i] = count[i]+1;
        }
    }
    return count;
}

int[] OneArray(int[,] array)
{
    int[] temp = new int[array.GetLength(0)*array.GetLength(1)];
    int count = 0;
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            temp[count] = array[i,j];
            count++;
        }
    }
    return temp;
}

void PrintArray2(int[] count)
{
    foreach (var item in count)
        System.Console.Write($"{item} ");
        System.Console.WriteLine();
}




Console.Clear();
System.Console.Write("Введите количество строк: ");
int rows = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов: ");
int cols = Convert.ToInt32(Console.ReadLine());
int[,] array = new int [rows, cols];
FillArray(array);
PrintArray(array);
System.Console.WriteLine();

int[] temp = OneArray(array);
PrintArray2(temp);
System.Console.WriteLine();

int[] count = frequencyArray(temp);
PrintArray2(count);



// int EnterNumber(string message)
// {
//     int number = -1;
//     while (number == -1)
//     {
//         System.Console.Write(message);
//         try
//         {
//             number = Convert.ToInt32(Console.ReadLine());
//             if (number < 1)
//             {
//                 System.Console.WriteLine("Введённое вами число не является натуральным.");
//                 number = -1;
//             }
//         }
//         catch
//         {
//             Console.WriteLine("То, что вы ввели, не является целым числом!");
//         }
//     }
//     return number;
// }

// void FillArray(int[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//         for (int j = i; j < array.GetLength(1); j++)
//             array[i, j] = new Random().Next(-10, 11);
// }

// void PrintArray(int[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//             Console.Write($"{array[i, j],3}    ");
//         System.Console.WriteLine();
//     }
// }

// int[,] QuantityOfNumbers(int[,] array)
// {
//     int max = array[0, 0];
//     int min = array[0, 0];    
//     foreach (int item in array)
//     {
//         if (item > max) max = item;
//         if (item < min) min = item;
//     }
//     int[,] quantity = new int[2, max - min + 1];
//     int index = 0;
//     while(min <= max)
//     {
//         int count = 0;
//         foreach (int item in array)
//         {
//             if (item == min) count++;
//         }
//         quantity[0, index] = min;
//         quantity[1, index] = count;
//         index++;
//         if (count != 0)
//         System.Console.WriteLine($"{min} встречается {count} раз.");
//         min++;
//     }
//     return quantity;
// }

// Console.Clear();
// int rows = EnterNumber("Введите количество строк: ");
// int cols = EnterNumber("Введите количество столбцов: ");
// int[,] array = new int[rows, cols];
// FillArray(array);
// PrintArray(array);
// int[, ] quantity = QuantityOfNumbers(array);