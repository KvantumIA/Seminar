package HW.Seminar_7_HW;

import HW.Seminar_7_HW.Calculation.ComputingDevice;
import HW.Seminar_7_HW.View.ViewCalculator;
import HW.Seminar_7_HW.View.ViewCalculator2;

public class main {
    public static void main(String[] args) {
        ComputingDevice computingDevice = new ComputingDevice();
        ViewCalculator2 viewCalculator = new ViewCalculator2(computingDevice);
        viewCalculator.run();


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Первое число: ");
//        float num = scanner.nextFloat();
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Второе число: ");
//        float num1 = scanner1.nextFloat();
//        float res = num + num1;
//        System.out.println(res);

    }
}
