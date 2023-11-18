// Задача 30: Напишите программу, которая выводит массив из 8 элементов, заполненный нулями и единицами в случайном порядке.
// [1,0,1,1,0,1,0,0]
//необходимо создать функцию булевого типа, которая проверяет находится ли в массиве единиц больше чем нулей

// new Random().Next(min, max) - случайные числа. Даст случайное целое число от min до max-1.

void Arr(int[] Array)
{
    for (int i = 0; i<Array.Length; i++)
    {
         Array[i] = new Random().Next(0, 2);
    }
}

bool OneZero(int[] Array)
{
    int count = 0;
    for (int i = 0; i<Array.Length; i++)
    {
        if (Array[i] == 1)
            count++;
    }

    bool flag = false;
    if (count>Array.Length/2)
        flag = true;
    return flag;
}


Console.Clear();
int[] Array = new int[8];
Arr(Array);
foreach (var i in Array)    
    System.Console.Write(i+" ");

System.Console.WriteLine();
System.Console.WriteLine(OneZero(Array));