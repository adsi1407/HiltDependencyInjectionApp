package com.example.hiltdependencyinjection.injecfromjavamodule;

import com.example.dataaccess.repository.UserRepositoryImpl;
import com.example.domain.repository.UserRepository;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class JavaModuleDIModule {

    @Binds
    public abstract UserRepository binUserRepository(UserRepositoryImpl userRepository);
}
