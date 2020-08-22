package com.example.hiltdependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.hiltdependencyinjection.classinjection.Calculations;
import com.example.hiltdependencyinjection.interfaceinjection.NumberRepository;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    Calculations adapter;

    @Inject
    NumberRepository numberRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, String.valueOf(adapter.addNumber(2) + numberRepository.getNumber()), Toast.LENGTH_SHORT).show();
    }
}