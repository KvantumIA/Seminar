// bool IsStringNumeric(char charToCheck) => char.IsLetterOrDigit(charToCheck) || char.IsAscii(charToCheck);

// string str = "Cool56:-)";
// int count = 0;
// foreach (var el in str) if (IsStringNumeric(el)) count++;
 
// Console.WriteLine(count);   //итог: колличество символов в строке равно 9



// Console.WriteLine("Введите строку");
//             string input = Console.ReadLine();
//             int ind = input.Where(i => !char.IsWhiteSpace(i)).Count();
//             Console.WriteLine("Количество букв равно {0}", ind);
//             Console.ReadLine();


string input = Console.ReadLine();
        // разбиваем предложения на слова (строки(
        foreach (string word in input.Split(new char[] { ' ' }))
        {
            // выводим слово и его длинну в консоль
            Console.WriteLine("{0}: {1}", word, word.Length);
        }