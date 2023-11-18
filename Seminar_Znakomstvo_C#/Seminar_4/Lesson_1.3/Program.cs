// Задача 28: Напишите программу, которая принимает на вход число N и выдаёт произведение чисел от 1 до N.
// 4 -> 24 
// 5 -> 120

int Summa (int num)
{
    int result = 1;
    for (int i = 1; i<=num; i++)
    {
        result = result * i;
    }
    return result;
}



Console.Clear();
System.Console.Write("Введите любое число: ");
int num = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine($"Факториал числа {num} равен {Summa(num)}");