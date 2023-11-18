// Фибоначчи

int Func(int num)
{
    if (num == 0 || num == 1) return num;
    return Func(num - 1) + Func(num - 2);
}

string Res(int num)
{
    string str = "";
    for (int i = 0; i < num; i++)
    {
        str += $"{Func(i)} ";
    }
    return str;
}

System.Console.WriteLine("Введите целое число");
int num = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine(Res(num));