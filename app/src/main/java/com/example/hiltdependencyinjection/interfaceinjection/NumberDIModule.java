package com.example.hiltdependencyinjection.interfaceinjection;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class NumberDIModule {

    @Binds
    public abstract NumberRepository bindNumberRepository(NumberRepositoryImpl numberRepository);
}
