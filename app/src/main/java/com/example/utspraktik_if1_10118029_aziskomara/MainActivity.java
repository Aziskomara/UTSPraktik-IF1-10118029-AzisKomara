package com.example.utspraktik_if1_10118029_aziskomara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private EditText edt_nik, edt_nama, edt_tanggal;
    private String nik, nama, tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn1 = findViewById(R.id.btn_selanjutnya);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nik = edt_nik.getText().toString();
                nama = edt_nama.getText().toString();
                tanggal = edt_tanggal.getText().toString();

                Intent intent1 = new Intent(MainActivity.this,Form_pengisian.class);
                intent1.putExtra("dataNama",nik);
                intent1.putExtra("dataNama",nama);
                intent1.putExtra("dataNama",tanggal);

                startActivity(intent1);
                finish();


            }
        });




    }
}