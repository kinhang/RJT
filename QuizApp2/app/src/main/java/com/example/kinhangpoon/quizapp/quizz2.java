package com.example.kinhangpoon.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quizz2 extends AppCompatActivity {
    Button Submitbutton;

    RadioGroup answerQuiz6;
    RadioGroup answerQuiz7;
    RadioGroup answerQuiz8;
    RadioGroup answerQuiz9;
    RadioGroup answerQuiz10;

    RadioButton answerQuiz6_1;
    RadioButton answerQuiz6_2;
    RadioButton answerQuiz6_3;
    RadioButton answerQuiz6_4;

    RadioButton answerQuiz7_1;
    RadioButton answerQuiz7_2;
    RadioButton answerQuiz7_3;
    RadioButton answerQuiz7_4;

    RadioButton answerQuiz8_1;
    RadioButton answerQuiz8_2;
    RadioButton answerQuiz8_3;
    RadioButton answerQuiz8_4;

    RadioButton answerQuiz9_1;
    RadioButton answerQuiz9_2;
    RadioButton answerQuiz9_3;
    RadioButton answerQuiz9_4;

    RadioButton answerQuiz10_1;
    RadioButton answerQuiz10_2;
    RadioButton answerQuiz10_3;
    RadioButton answerQuiz10_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz2);

        final String playername = getIntent().getExtras().getString("Name");

        answerQuiz6 = findViewById(R.id.answer6);
        answerQuiz7 = findViewById(R.id.answer7);
        answerQuiz8 = findViewById(R.id.answer8);
        answerQuiz9 = findViewById(R.id.answer9);
        answerQuiz10 = findViewById(R.id.answer10);

        answerQuiz6_1 = findViewById(R.id.answer6_1);
        answerQuiz6_2 = findViewById(R.id.answer6_2);
        answerQuiz6_3 = findViewById(R.id.answer6_3);
        answerQuiz6_4 = findViewById(R.id.answer6_4);

        answerQuiz7_1 = findViewById(R.id.answer7_1);
        answerQuiz7_2 = findViewById(R.id.answer7_2);
        answerQuiz7_3 = findViewById(R.id.answer7_3);
        answerQuiz7_4 = findViewById(R.id.answer7_4);

        answerQuiz8_1 = findViewById(R.id.answer8_1);
        answerQuiz8_2 = findViewById(R.id.answer8_2);
        answerQuiz8_3 = findViewById(R.id.answer8_3);
        answerQuiz8_4 = findViewById(R.id.answer8_4);

        answerQuiz9_1 = findViewById(R.id.answer9_1);
        answerQuiz9_2 = findViewById(R.id.answer9_2);
        answerQuiz9_3 = findViewById(R.id.answer9_3);
        answerQuiz9_4 = findViewById(R.id.answer9_4);

        answerQuiz10_1 = findViewById(R.id.answer10_1);
        answerQuiz10_2 = findViewById(R.id.answer10_2);
        answerQuiz10_3 = findViewById(R.id.answer10_3);
        answerQuiz10_4 = findViewById(R.id.answer10_4);


        Submitbutton = findViewById(R.id.buttonSubmit);

        Submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quizz2.this,result.class);
                i.putExtra("Name",playername);
                i.putExtra("answer1",getIntent().getExtras().getString("answer1"));
                i.putExtra("answer2",getIntent().getExtras().getString("answer2"));
                i.putExtra("answer3",getIntent().getExtras().getString("answer3"));
                i.putExtra("answer4",getIntent().getExtras().getString("answer4"));
                i.putExtra("answer5",getIntent().getExtras().getString("answer5"));
                int answer6Id = answerQuiz6.getCheckedRadioButtonId();
                switch (answer6Id){
                    case R.id.answer6_1:
                        i.putExtra("answer6",answerQuiz6_1.getText().toString());
                        break;
                    case R.id.answer6_2:
                        i.putExtra("answer6",answerQuiz6_2.getText().toString());
                        break;
                    case R.id.answer6_3:
                        i.putExtra("answer6",answerQuiz6_3.getText().toString());
                        break;
                    case R.id.answer6_4:
                        i.putExtra("answer6",answerQuiz6_4.getText().toString());
                        break;
                }
                int answer7Id = answerQuiz7.getCheckedRadioButtonId();
                switch (answer7Id){
                    case R.id.answer7_1:
                        i.putExtra("answer7",answerQuiz7_1.getText().toString());
                        break;
                    case R.id.answer7_2:
                        i.putExtra("answer7",answerQuiz7_2.getText().toString());
                        break;
                    case R.id.answer7_3:
                        i.putExtra("answer7",answerQuiz7_3.getText().toString());
                        break;
                    case R.id.answer7_4:
                        i.putExtra("answer7",answerQuiz7_4.getText().toString());
                        break;
                }

                int answer8Id = answerQuiz8.getCheckedRadioButtonId();
                switch (answer8Id){
                    case R.id.answer8_1:
                        i.putExtra("answer8",answerQuiz8_1.getText().toString());
                        break;
                    case R.id.answer8_2:
                        i.putExtra("answer8",answerQuiz8_2.getText().toString());
                        break;
                    case R.id.answer8_3:
                        i.putExtra("answer8",answerQuiz8_3.getText().toString());
                        break;
                    case R.id.answer8_4:
                        i.putExtra("answer8",answerQuiz8_3.getText().toString());
                        break;
                }

                int answer9Id = answerQuiz9.getCheckedRadioButtonId();
                switch (answer9Id){
                    case R.id.answer9_1:
                        i.putExtra("answer9",answerQuiz9_1.getText().toString());
                        break;
                    case R.id.answer9_2:
                        i.putExtra("answer9",answerQuiz9_2.getText().toString());
                        break;
                    case R.id.answer9_3:
                        i.putExtra("answer9",answerQuiz9_3.getText().toString());
                        break;
                    case R.id.answer9_4:
                        i.putExtra("answer9",answerQuiz9_4.getText().toString());
                        break;
                }

                int answer10Id = answerQuiz10.getCheckedRadioButtonId();
                switch (answer10Id){
                    case R.id.answer10_1:
                        i.putExtra("answer10",answerQuiz10_1.getText().toString());
                        break;
                    case R.id.answer10_2:
                        i.putExtra("answer10",answerQuiz10_2.getText().toString());
                        break;
                    case R.id.answer10_3:
                        i.putExtra("answer10",answerQuiz10_3.getText().toString());
                        break;
                    case R.id.answer10_4:
                        i.putExtra("answer10",answerQuiz10_4.getText().toString());
                        break;
                }
                startActivity(i);
            }
        });
    }
}
