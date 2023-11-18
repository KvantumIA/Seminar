// Задача 65: Задайте значения M и N. Напишите программу, которая выведет все натуральные числа в промежутке от M до N.
// M = 1; N = 5 -> "1, 2, 3, 4, 5"
// M = 4; N = 8 -> "4, 6, 7, 8"


string GetNumbers(int numStop, int numStart)
{
    string Numbers = "";
    while (true)
    {
        Numbers = numStop + " " + Numbers;
        numStop--;
        if (numStop==numStart)
            break;
    }
    return Numbers;
}

string GetNumbersRec(int numStop, int numStart)
{
    if (numStop==numStart)  return ($"{numStop} ");
    return GetNumbersRec(numStop - 1, numStart) + numStop + " ";
}




Console.Clear();
System.Console.WriteLine("Введите целое число начало: ");
int numStart = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Введите целое число конец: ");
int numStop = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine($"Все натуральные от {numStart} до {numStop} равна {GetNumbers(num, num2)}");
System.Console.WriteLine($"Все натуральные от {numStart} до {numStop} равна {GetNumbersRec(numStop, numStart)}");