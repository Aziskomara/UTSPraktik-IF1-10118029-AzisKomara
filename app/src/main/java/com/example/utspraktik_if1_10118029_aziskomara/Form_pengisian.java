package com.example.utspraktik_if1_10118029_aziskomara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Form_pengisian extends AppCompatActivity {

    private EditText nik2, nama2, tanggal2;
    private String Nik, Nama, Tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pengisian);

        nik2 = findViewById(R.id.edt_nik2);
        nama2 = findViewById(R.id.edt_nama2);
        tanggal2 = findViewById(R.id.edt_tanggal2);

        Intent intent2 =getIntent();
        Nik = intent2.getStringExtra("data_nik");
        Nama = intent2.getStringExtra("data_nama");
        Tanggal = intent2.getStringExtra("data_tanggal");

        nik2.setText(Nik);
        nama2.setText(Nama);
        tanggal2.setText(Tanggal);
    }
}