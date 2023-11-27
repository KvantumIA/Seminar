package HW.Seminar_7_HW.Calculation;

import HW.Seminar_7_HW.Calculation.Calculation;
import HW.Seminar_7_HW.Interface.Calculable;
import HW.Seminar_7_HW.Interface.IComputingDevice;

public class ComputingDevice implements IComputingDevice {
    @Override
    public Calculable create(float primaryArg) {
        return new Calculation(primaryArg);
    }
}
