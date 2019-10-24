package com.morajavier.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnEjer1, btnEjer2, btnEjer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEjer1 = findViewById(R.id.btnEjer1);
        btnEjer2 = findViewById(R.id.btnEjer2);
        btnEjer3 = findViewById(R.id.btnEjer3);

        btnEjer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, SensorUnoActivity.class);
                startActivity(intento);
            }
        });

        btnEjer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, SensorDosActivity.class);
                startActivity(intento);
            }
        });

        btnEjer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intento = new Intent();
                startActivity(intento);*/
                Toast.makeText(MainActivity.this, "hola", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
