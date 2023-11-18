// Задача 42: Напишите программу, которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3  -> 11
// 2  -> 10;


string Res(int N)
{
    string res = "";
    while (N > 0)
    {
        res = Convert.ToString(N % 2) + res;
        N = N / 2;
    }
    return res;
}
System.Console.WriteLine("Введите двоичное число: ");
int N = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine(Res(N));