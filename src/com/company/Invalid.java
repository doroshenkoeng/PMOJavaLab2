package com.company;

public class Invalid extends Allowance {
    private Integer groupNumber;

    public Invalid(double ratio, double minAllowance, Integer groupNumber) {
        super(ratio, minAllowance);
        this.groupNumber = groupNumber;
    }

    Invalid() {
        groupNumber = 1;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getMinFirstGroupAllowance() {
        return super.getMinAllowance() * 1.3;
    }

    public double getMinSecondGroupAllowance() {
        return super.getMinAllowance() * 1.2;
    }

}
