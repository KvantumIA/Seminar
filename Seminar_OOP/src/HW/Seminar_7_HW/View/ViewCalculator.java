package HW.Seminar_7_HW.View;

import HW.Seminar_7_HW.Interface.Calculable;
import HW.Seminar_7_HW.Interface.IComputingDevice;

import java.util.Scanner;
public class ViewCalculator {
    private IComputingDevice computingDevice;

    public ViewCalculator(IComputingDevice computingDevice) {
        this.computingDevice = computingDevice;
    }

    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первый аргумент: ");
            if (scanner.hasNextFloat()){
                float primaryArg = scanner.nextFloat();
                Calculable calculator = computingDevice.create(primaryArg);
                while (true) {
                    String cmd = prompt("Введите команду (*, +, =) : ");
                    if (cmd.equals("*")) {
                        float arg = promptDouble("Введите второй аргумент: ");
                        calculator.multi(arg);
                        continue;
                    }
                    if (cmd.equals("+")) {
                        float arg = promptDouble("Введите второй аргумент: ");
                        calculator.sum(arg);
                        continue;
                    }
                    if (cmd.equals("=")) {
                        float result = calculator.getResult();
                        System.out.println("Результат:" + result);
                        break;
                    }
                }
                String cmd = prompt("Еще посчитать (Y/N)?");
                if (cmd.equals("Y")) {
                    continue;
                }
                break;
            }
            else {
                System.out.println("Вы ввели не число!");
            }
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private float promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextFloat();
    }
}