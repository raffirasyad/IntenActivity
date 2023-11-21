package com.example.eksplisitimplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button btn_explicit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Inisialisasi btn_explicit
        btn_explicit = findViewById(R.id.btn_explicit);

        // Menambahkan onClickListener ke btn_explicit
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat eksplicit intent untuk SecondActivity
                Intent explicitIntent = new Intent(Home.this, HelloActivity.class);

                // Menjalankan intent
                startActivity(explicitIntent);
            }
        });

        btn_explicit = findViewById(R.id.btn_explicit2);

        // Menambahkan onClickListener ke btn_explicit
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat eksplicit intent untuk SecondActivity
                Intent explicitIntent = new Intent(Home.this, Sianida.class);

                // Menjalankan intent
                startActivity(explicitIntent);
            }
        });

        btn_explicit = findViewById(R.id.btn_explicit3);

        // Menambahkan onClickListener ke btn_explicit
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat eksplicit intent untuk SecondActivity
                Intent explicitIntent = new Intent(Home.this, Count.class);

                // Menjalankan intent
                startActivity(explicitIntent);
            }
        });

        btn_explicit = findViewById(R.id.btn_explicit4);

        // Menambahkan onClickListener ke btn_explicit
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat eksplicit intent untuk SecondActivity
                Intent explicitIntent = new Intent(Home.this, TwoActivity.class);

                // Menjalankan intent
                startActivity(explicitIntent);
            }
        });

        btn_explicit = findViewById(R.id.btn_explicit5);

        // Menambahkan onClickListener ke btn_explicit
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat eksplicit intent untuk SecondActivity
                Intent explicitIntent = new Intent(Home.this, SetAlarm.class);

                // Menjalankan intent
                startActivity(explicitIntent);
            }
        });

    }
}