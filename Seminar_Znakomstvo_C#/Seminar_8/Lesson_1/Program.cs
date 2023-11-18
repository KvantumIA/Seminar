// Задача 53: Задайте двумерный массив. Напишите программу, которая поменяет местами первую и последнюю строку массива.

void ChangeRows(int[,] Array)
{
    for (int j = 0; j < Array.GetLength(1); j++)
    {
        (Array[0,j],Array[Array.GetLength(0)-1,j]) = (Array[Array.GetLength(0)-1,j],Array[0,j]);
    }
}

void RandomFillArray(int[,] Array)
{
    for (int i = 0; i < Array.GetLength(0); i++)
    {
        for (int j = 0; j < Array.GetLength(1); j++)
            Array[i,j] = new Random().Next(-20,21);
    }
}

void PrintArray(int[,] Array)
{
    for (int i = 0; i < Array.GetLength(0); i++)
    {
        for (int j = 0; j < Array.GetLength(1); j++)
            System.Console.Write($"{Array[i,j],3} ");
        System.Console.WriteLine();
    }
    System.Console.WriteLine();
}

System.Console.Write("Введите количество строк массива: ");
int rows = Convert.ToInt32(System.Console.ReadLine());
System.Console.Write("Введите количество столбцов массива: ");
int columns = Convert.ToInt32(System.Console.ReadLine());
int[,] Array = new int[rows,columns];

RandomFillArray(Array);
PrintArray(Array);
ChangeRows(Array);
PrintArray(Array);