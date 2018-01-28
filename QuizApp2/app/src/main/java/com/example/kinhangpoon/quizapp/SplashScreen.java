package com.example.kinhangpoon.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread th = new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                Intent i = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(i);
            }
        };
        th.start();
    }
}
