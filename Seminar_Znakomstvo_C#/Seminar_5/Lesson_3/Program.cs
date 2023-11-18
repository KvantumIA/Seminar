// Задача 33: Задайте массив. Напишите программу, которая определяет, присутствует ли заданное число в массиве.
// 4; массив [6, 7, 19, 345, 3] -> нет
// -3; массив [6, 7, 19, 345, 3] -> да



void FindNumberInArray(int[] array, int num)
{
    bool Find = false;
    foreach (var item in array)
    {
        if (item == num)
        {
            System.Console.WriteLine("Да");
            Find = true;
            break;
        }
    }
    if (Find == false) System.Console.WriteLine("Нет");
}



void FillArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-9,10);
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




System.Console.Write("Введите диапазон массива: ");
int size = Convert.ToInt32(System.Console.ReadLine());
System.Console.Write("Введите число: ");
int num = Convert.ToInt32(System.Console.ReadLine());

int[] Array = new int[size];

FillArray(Array);
PrintArray(Array);
FindNumberInArray(Array, num);