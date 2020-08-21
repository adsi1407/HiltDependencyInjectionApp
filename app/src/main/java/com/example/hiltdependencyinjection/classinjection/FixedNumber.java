package com.example.hiltdependencyinjection.classinjection;

import javax.inject.Inject;

public class FixedNumber {

    @Inject
    public FixedNumber() {}

    public int getNumber() {
        return 2;
    }
}
