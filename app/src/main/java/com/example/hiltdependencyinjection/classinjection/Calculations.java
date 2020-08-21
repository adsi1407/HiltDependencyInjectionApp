package com.example.hiltdependencyinjection.classinjection;

import javax.inject.Inject;

public class Calculations {

    private final FixedNumber fixedNumber;

    @Inject
    public Calculations(FixedNumber fixedNumber) {
        this.fixedNumber = fixedNumber;
    }

    public int addNumber(int number){
        return fixedNumber.getNumber() + number;
    }
}
