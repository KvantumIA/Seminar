// Задача 24: Напишите программу, которая принимает на вход число (А) и выдаёт сумму чисел от 1 до А.
// 7 -> 28
// 4 -> 10
// 8 -> 36

int Summa (int num)
{
    int result = 0;
    for (int i = 0; i<=num; i++)
    {
        result += i;
    }
    return result;
}


Console.Clear();
System.Console.Write("Ввести натуральное число: ");
int num = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine($"Сумма чисел от 1 до {num} равна {Summa(num)}");