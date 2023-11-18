// Задача 63: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от 1 до N.
// N = 5 -> "1, 2, 3, 4, 5"
// N = 6 -> "1, 2, 3, 4, 5, 6"

string GetNumbers(int num)
{
    string Numbers = "";
    while (true)
    {
        Numbers = num + " " + Numbers;
        num--;
        if (num==0)
            break;
    }
    return Numbers;
}

string GetNumbersRec(int num)
{
    if (num==0)  return "";
    return GetNumbersRec(num - 1) + num + " ";
}




Console.Clear();
System.Console.WriteLine("Введите целое число ");
int num = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine($"Все натуральные от 1 до {num} равна {GetNumbers(num)}");
System.Console.WriteLine($"Все натуральные от 1 до {num} равна {GetNumbersRec(num)}");