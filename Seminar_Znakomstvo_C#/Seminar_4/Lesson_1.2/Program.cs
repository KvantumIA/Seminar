// Задача 26: Напишите программу, которая принимает на вход число и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5


// int Kol(int num)
// {
//     int result = 0;
//     if (num%10 == 0)
//         result = 1;
//     else if (num == 1)
//         result = 1;
//     else 
//     {
//         double d = Math.Log10(num);
//         double c = Math.Ceiling(d);
//         result = Convert.ToInt32(d);
//     }
//     return result;
// }


// Console.Clear();
// System.Console.Write("Введите любое число: ");
// int num = Math.Abs(Convert.ToInt32 (Console.ReadLine()));

// System.Console.WriteLine($"Количество чисел: {Kol(num)}");



int Kol(int num)
{
    int count = 0;
    if (num == 0) return 1;
    while (num >= 1)
    {
         num=num/10;
         count++;
    }
    return count;
}

Console.Clear();
System.Console.WriteLine("Ввести целое число ");
int num = Math.Abs(Convert.ToInt32 (Console.ReadLine()));

System.Console.WriteLine(Kol(num));
