package com.example.tema24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOpen(View view) {
        Context context=getApplicationContext();
        startActivity(new Intent(context,MainActivity2.class));
    }
    public void on3Open(View view) {
        Context context=getApplicationContext();
        startActivity(new Intent(context,MainActivity3.class));
    }
}