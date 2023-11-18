// Задача 31: Задайте массив из 12 элементов, заполненный случайными числами из промежутка [-9, 9]. Найдите сумму отрицательных и положительных элементов массива.
// Например, в массиве [3,9,-8,1,0,-7,2,-1,8,-3,-1,6] сумма положительных чисел равна 29, сумма отрицательных равна -20.


void FillArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-9,10);
    }
}

void PrintArray(int[] array)
{
    foreach(var item in array)
    {
        System.Console.Write($"{item} ");
    }
    System.Console.WriteLine();
}

void FindSumm(int[] array)
{
    int summP = 0;
    int summN = 0;
    foreach (var item in array)
        {
            if (item>0)
                summP += item;
            else
                summN += item;
        }
    System.Console.WriteLine($"Сумма отрицательных элементов массива равна {summN}");
    System.Console.WriteLine($"Сумма положительных элементов массива равна {summP}");
}


Console.Clear();
System.Console.Write("Введите размерность массива: ");
int size = Convert.ToInt32(Console.ReadLine());
int[] array = new int[size];
FillArray(array);
PrintArray(array);
FindSumm(array);