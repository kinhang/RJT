package com.example.kinhangpoon.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView result;
    TextView rightView;
    TextView wrongView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int right =0,wrong =0;

        result = findViewById(R.id.textViewResult);
        rightView = findViewById(R.id.textViewRight);
        wrongView = findViewById(R.id.textViewWrong);

        String player = getIntent().getExtras().getString("Name");
        result.setText(player+"'s result: ");

        String quiz1 = getIntent().getExtras().getString("answer1");

        if(quiz1.equals("12")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz2 = getIntent().getExtras().getString("answer2");

        if(quiz2.equals("3")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz3 = getIntent().getExtras().getString("answer3");

        if(quiz3.equals("72")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz4 = getIntent().getExtras().getString("answer4");

        if(quiz4.equals("22")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz5 = getIntent().getExtras().getString("answer5");

        if(quiz5.equals("14")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz6 = getIntent().getExtras().getString("answer6");

        if(quiz6.equals("45")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz7 = getIntent().getExtras().getString("answer7");

        if(quiz7.equals("7")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz8 = getIntent().getExtras().getString("answer8");

        if(quiz8.equals("42")){
            right++;
        }
        else {
            wrong++;
        }

        String quiz9 = getIntent().getExtras().getString("answer9");

        if(quiz9.equals("62")){
            right++;
        }
        else {
            wrong++;
        }
        String quiz10 = getIntent().getExtras().getString("answer10");

        if(quiz10.equals("5")){
            right++;
        }
        else {
            wrong++;
        }
        rightView.setText("Number of Correct Answer is: "+right);
        wrongView.setText("Number of Wrong Answer is: "+wrong);
    }
}
