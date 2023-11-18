// Задача 39: Напишите программу, которая перевернёт 
// одномерный массив (последний элемент будет на первом месте, 
// а первый - на последнем и т.д.)
// [1 2 3 4 5] -> [5 4 3 2 1]
// [6 7 3 6] -> [6 3 7 6]


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
        Console.Write($"{item} ");
    }
    System.Console.WriteLine();
}

void ReverseArray(int[] array)
{
    //int temp=0;
    for (int i=0;i<array.Length/2;i++)
    {
        // temp = array[array.Length-1-i];
        // array[array.Length-1-i] = array[i];
        // array[i] = temp;
        //(x,y) = (y,x);
        (array[array.Length-1-i],array[i]  ) = (array[i] ,array[array.Length-1-i] ); //сокращеная форма
    }
}



Console.Clear();
System.Console.WriteLine("Введите размерность массива ");
int size = Convert.ToInt32(Console.ReadLine());
int[] array = new int[size];
FillArray(array);
PrintArray(array);
ReverseArray(array);
PrintArray(array);