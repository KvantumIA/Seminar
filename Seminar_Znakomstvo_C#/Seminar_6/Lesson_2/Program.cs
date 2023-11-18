// Задача 40: Напишите программу, которая принимает на вход три числа и проверяет, 
// может ли существовать треугольник с сторонами такой длины.
// Теорема о неравенстве треугольника: каждая сторона треугольника меньше суммы двух других сторон.

bool SummaStoron(int num1, int num2, int num3)
{
    bool summa = false;
    if (num1 < num2+num3 && num2 < num1+num3 && num3 < num1+num2)
        summa = true;
    // else summa = false;
    return summa;
}

Console.Clear();

System.Console.WriteLine($"Введите число 1: ");
int num1 = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine($"Введите число 2: ");
int num2 = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine($"Введите число 3: ");
int num3 = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine($"Может существовать такой треугольник: {SummaStoron(num1, num2, num3)}");