package com.example.androidchips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.androidchips.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    String[] arrayRitmo = {"Baião", "Brega-romântico", "Brega-pop", "Brega-funk", "Ciranda",
            "Coco", "Cavalo-marinho", "Forró", "Frevo", "Maracatu", "Caboclinho",
            "Xaxado", "Manguebeat", "Rap", "Sertanejo", "Rock", "Samba",
            "Pop", "Metal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}