// Задача 44: Не используя рекурсию, выведите первые N чисел Фибоначчи. Первые два числа Фибоначчи: 0 и 1.
// Если N = 5 -> 0 1 1 2 3
// Если N = 3 -> 0 1 1
// Если N = 7 -> 0 1 1 2 3 5 8

int[] Fibonacci(int num)
{
    int[] Fibon = new int[num];
    Fibon[0] = 0;
    Fibon[1] = 1;
    for (int i = 2; i < num; i++)
    {
        Fibon[i] = Fibon[i-1]+Fibon[i-2];
    }
    return Fibon;
}

void PrintArray(int[] array)
{
    foreach (var item in array)
    {
        Console.Write($"{item} ");
    }
    System.Console.WriteLine();
}


Console.Clear();
System.Console.WriteLine("Введите число: ");
int num = Convert.ToInt32(Console.ReadLine());
int[] array = Fibonacci(num);

PrintArray(array);