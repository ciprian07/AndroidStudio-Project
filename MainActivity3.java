package com.example.tema24;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    Button buton;
    ImageView img;
    Button zoomOut;
    Button zoomIn;

    int images[]={R.drawable.img1,R.drawable.img2,R.drawable.img3};
    int i=1;int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img=(ImageView) findViewById(R.id.img1);
        buton=(Button) findViewById(R.id.button);
        img.setImageResource(images[0]);
        zoomIn=(Button) findViewById(R.id.zoomIn);
        zoomOut=(Button) findViewById(R.id.zoomOut);
        Log.e("Ciprian","onCreate");
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.e("Ciprian","onStart");
    }

    protected void onStop(){
        super.onStop();
        Log.e("Ciprian","onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.e("Ciprian","onDestroy");
    }
    protected void onPause(){
        super.onPause();
        Log.e("Ciprian","onPause");
    }


    public void onNext(View view) {
        img.setImageResource(images[i]);
        i++;
        if(i==3)
            i=0;
    }

    public void on3Back(View view) {
        Context context=getApplicationContext();
        startActivity(new Intent(context,MainActivity.class));
    }


    public void zoomIn(View view) {
        j++;
            float x = img.getScaleX();
            float y = img.getScaleY();
            img.setScaleX((float)(x*1.5));
            img.setScaleY((float)(y*1.5));
        }


    public void zoomOut(View view) {
        float x = img.getScaleX();
        float y = img.getScaleY();
        img.setScaleX((float)(x/1.5));
        img.setScaleY((float)(y/1.5));
        j--;
    }
}
