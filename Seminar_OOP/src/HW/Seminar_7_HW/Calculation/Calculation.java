package HW.Seminar_7_HW.Calculation;

import HW.Seminar_7_HW.Interface.Calculable;

public class Calculation implements Calculable {
    private float primaryArg;

    public Calculation(float primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(float arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable substr(float arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public Calculable multi(float arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculable separ(float arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public float getResult() {
        return primaryArg;
    }

}
