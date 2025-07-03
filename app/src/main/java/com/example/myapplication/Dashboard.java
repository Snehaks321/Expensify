package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
 Button btnAddexpense,btnCategory,btnCalendar,btnExpenserep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btnAddexpense = findViewById(R.id.addexpense);
        btnCategory = findViewById(R.id.category);
        btnCalendar = findViewById(R.id.calendar);
        btnExpenserep = findViewById(R.id.expenserep);
        btnAddexpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this,Addyourexpense.class));
                finish();
            }
        });
    }
}