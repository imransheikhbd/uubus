package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activiy);
        Thread thread=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(SplashActiviy.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();


    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
