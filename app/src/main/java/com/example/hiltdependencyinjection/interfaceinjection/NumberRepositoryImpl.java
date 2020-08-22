package com.example.hiltdependencyinjection.interfaceinjection;

import javax.inject.Inject;

public class NumberRepositoryImpl implements NumberRepository {

    @Inject
    public NumberRepositoryImpl () {

    }

    @Override
    public int getNumber() {
        return 10;
    }
}
