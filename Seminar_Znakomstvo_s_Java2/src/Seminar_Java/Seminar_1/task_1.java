package Семинары.Seminar_Znakomstvo_JAVA.Seminar_1;

// public class task_1 {
//     /**
//      * Innertask_1
//      */
//     public class Innertask_1 {
//         public static void main(String[] args) {
//             int a = 123;
//             // a = a-- - --a;   //2     123 - 121
//             a = --a - a--;      //0     122 - 122
//             System.out.println(a);
//         }
        
//     }
// }

//------------------------------------------------------

 import java.util.Scanner;
 public class task_1 {
     public static void main(String[] args) {
         Scanner iScanner = new Scanner(System.in);
         System.out.printf("name: ");
         String name = iScanner.nextLine();
         System.out.printf("Привет %s!", name);
         iScanner.close();
     }
    
 }

//------------------------------------------------------

//Задана натуральная степень К. Сформировать случайным образом список коэффициентов(значение от 0 до 100) 
//многочлена многочлен степени К.





//------------------------------------------------------

//Даны два файла, в каждом из которых находится запись многочлена. Сформировать файл содержащий сумму многочленов.