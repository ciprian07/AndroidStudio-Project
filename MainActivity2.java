package com.example.tema24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onBack(View view) {
        Context context=getApplicationContext();
        startActivity(new Intent(context,MainActivity.class));
        Toast.makeText(getApplicationContext() ,"Ati revenit la pagina principala!",Toast.LENGTH_SHORT).show();
        Log.e("Logu-ul zice","Ati revenit la pagina principala!");
    }
}