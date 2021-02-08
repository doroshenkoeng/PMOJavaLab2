package com.company;

public class Allowance {
    private double ratio;
    private double minAllowance;

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public void setMinAllowance(double minAllowance) {
        this.minAllowance = minAllowance;
    }

    public Allowance(double ratio, double minAllowance) {
        this.ratio = ratio;
        this.minAllowance = minAllowance;
    }

    Allowance()  {
        ratio = 1;
        minAllowance = 1;
    }

    public double getMinAllowance() {
        return minAllowance;
    }

    public double getAllowance() {
        return ratio * minAllowance;
    }
}
