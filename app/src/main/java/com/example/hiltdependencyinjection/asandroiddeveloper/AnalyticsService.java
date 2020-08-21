package com.example.hiltdependencyinjection.asandroiddeveloper;

import javax.inject.Inject;

public class AnalyticsService {

    @Inject
    public AnalyticsService() {}

    public int getNumber() {
        return 2;
    }
}
