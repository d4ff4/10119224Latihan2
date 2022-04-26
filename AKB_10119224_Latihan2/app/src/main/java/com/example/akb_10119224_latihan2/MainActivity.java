package com.example.akb_10119224_latihan2;
// Nama : Daffa Adisthia Fauzaan
// NIM : 10119224
// Kelas : IF-06
// Tanggal Pengerjaan : 26 April 2022

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void btnRegister(View view){
            Intent intent = new Intent(this, com.example.akb_10119224_latihan2.RegisterActivity.class);
            startActivity(intent);
    }
}