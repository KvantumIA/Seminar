package HW.Seminar_7_HW;

import HW.Seminar_7_HW.Calculation.ComputingDevice;
import HW.Seminar_7_HW.View.ViewCalculator;

public class main {
    public static void main(String[] args) {
        ComputingDevice computingDevice = new ComputingDevice();
        ViewCalculator viewCalculator = new ViewCalculator(computingDevice);
        viewCalculator.run();
    }
}
