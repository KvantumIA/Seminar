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
        boolean exit = true;
        while (exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первый аргумент: ");
            if (scanner.hasNextFloat()){
                float primaryArg = scanner.nextFloat();
                Calculable calculator = computingDevice.create(primaryArg);
                while (exit) {
                    String cmd = prompt("Введите команду (+, -, *, /, =) : ");
                    switch (cmd){
                        case "*":
                            float arg = promptDouble();
                            calculator.multi(arg);
                            break;
                        case "+":
                            float arg2 = promptDouble();
                            calculator.sum(arg2);
                            break;
                        case "-":
                            float arg3 = promptDouble();
                            calculator.substr(arg3);
                            break;
                        case "/":
                            float arg4 = promptDouble();
                            calculator.separ(arg4);
                            break;
                        case "=":
                            float result = calculator.getResult();
                            System.out.println("Результат:" + result);
                            exit = exitSwitch();
                            if (exit){
                                run();
                            }
                            break;
                    }
                }
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
    private float promptDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите следующий аргумент: ");
        return in.nextFloat();
    }
    private boolean exitSwitch(){
        boolean exit = true;
        String exitSwitch = prompt("Еще посчитать (y/n)?");
        if (exitSwitch.equals("y")) {
            return exit;
        }
        else {
            exit = false;
            return exit;
        }
    }
}
