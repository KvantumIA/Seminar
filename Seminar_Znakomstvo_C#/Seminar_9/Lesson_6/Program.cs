// Задача 69: Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
// A = 3; B = 5 -> 243 (3⁵)
// A = 2; B = 3 -> 8

int Stepen(int numA, int numB)
{
    int sum = 1;
    int count = 0;
    while (true)
    {
        sum *= numA;
        count++;
        if (count == numB)
            break;
    }
    return sum;
}

int StepenRec(int numA, int numB)
{
    if (numB == 0) return 1;
    return numA * StepenRec(numA, numB-1);
}




Console.Clear();
System.Console.WriteLine("Введите целое число А ");
int numA = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Введите целое число В ");
int numB = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine($"Число {numA} возведенное в число {numB} = {Stepen(numA, numB)}");
System.Console.WriteLine($"Число {numA} возведенное в число {numB} = {StepenRec(numA, numB)}");