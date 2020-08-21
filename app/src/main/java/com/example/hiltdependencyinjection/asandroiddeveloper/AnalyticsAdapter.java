package com.example.hiltdependencyinjection.asandroiddeveloper;

import javax.inject.Inject;

public class AnalyticsAdapter {

    private final AnalyticsService service;

    @Inject
    public AnalyticsAdapter(AnalyticsService service) {
        this.service = service;
    }

    public int addNumber(){
        return service.getNumber() + 2;
    }
}
