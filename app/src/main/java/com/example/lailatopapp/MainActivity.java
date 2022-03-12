package com.example.lailatopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i = new Intent(this, RS.class);
        startActivity(i);


    }

    public void clickpolice(View view) {
        //gambar police di click
        Intent i = new Intent(this, police.class);
        startActivity(i);

    }

    public void clicksekolah(View view) {
        //gambar sekolah di click
        Intent i = new Intent(this, sekolah.class);
        startActivity(i);
    }

    public void clicksupermarket(View view) {
        //gambar sekolah di click
        Intent i = new Intent(this, supermarket.class);
        startActivity(i);
    }
}