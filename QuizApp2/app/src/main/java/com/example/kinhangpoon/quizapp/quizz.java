package com.example.kinhangpoon.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quizz extends AppCompatActivity {

    Button Nextbutton;

    RadioGroup answerQuiz1;
    RadioGroup answerQuiz2;
    RadioGroup answerQuiz3;
    RadioGroup answerQuiz4;
    RadioGroup answerQuiz5;

    RadioButton answerQuiz1_1;
    RadioButton answerQuiz1_2;
    RadioButton answerQuiz1_3;
    RadioButton answerQuiz1_4;

    RadioButton answerQuiz2_1;
    RadioButton answerQuiz2_2;
    RadioButton answerQuiz2_3;
    RadioButton answerQuiz2_4;

    RadioButton answerQuiz3_1;
    RadioButton answerQuiz3_2;
    RadioButton answerQuiz3_3;
    RadioButton answerQuiz3_4;

    RadioButton answerQuiz4_1;
    RadioButton answerQuiz4_2;
    RadioButton answerQuiz4_3;
    RadioButton answerQuiz4_4;

    RadioButton answerQuiz5_1;
    RadioButton answerQuiz5_2;
    RadioButton answerQuiz5_3;
    RadioButton answerQuiz5_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        final String playername = getIntent().getExtras().getString("Name");

        answerQuiz1 = findViewById(R.id.answer1);
        answerQuiz2 = findViewById(R.id.answer2);
        answerQuiz3 = findViewById(R.id.answer3);
        answerQuiz4 = findViewById(R.id.answer4);
        answerQuiz5 = findViewById(R.id.answer5);

        answerQuiz1_1 = findViewById(R.id.answer1_1);
        answerQuiz1_2 = findViewById(R.id.answer1_2);
        answerQuiz1_3 = findViewById(R.id.answer1_3);
        answerQuiz1_4 = findViewById(R.id.answer1_4);

        answerQuiz2_1 = findViewById(R.id.answer2_1);
        answerQuiz2_2 = findViewById(R.id.answer2_2);
        answerQuiz2_3 = findViewById(R.id.answer2_3);
        answerQuiz2_4 = findViewById(R.id.answer2_4);

        answerQuiz3_1 = findViewById(R.id.answer3_1);
        answerQuiz3_2 = findViewById(R.id.answer3_2);
        answerQuiz3_3 = findViewById(R.id.answer3_3);
        answerQuiz3_4 = findViewById(R.id.answer3_4);

        answerQuiz4_1 = findViewById(R.id.answer4_1);
        answerQuiz4_2 = findViewById(R.id.answer4_2);
        answerQuiz4_3 = findViewById(R.id.answer4_3);
        answerQuiz4_4 = findViewById(R.id.answer4_4);

        answerQuiz5_1 = findViewById(R.id.answer5_1);
        answerQuiz5_2 = findViewById(R.id.answer5_2);
        answerQuiz5_3 = findViewById(R.id.answer5_3);
        answerQuiz5_4 = findViewById(R.id.answer5_4);


        Nextbutton = findViewById(R.id.buttonNext);

        Nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quizz.this, quizz2.class);
                i.putExtra("Name", playername);
                int answer1Id = answerQuiz1.getCheckedRadioButtonId();
                switch (answer1Id) {
                    case R.id.answer1_1:
                        i.putExtra("answer1", answerQuiz1_1.getText().toString());
                        break;
                    case R.id.answer1_2:
                        i.putExtra("answer1", answerQuiz1_2.getText().toString());
                        break;
                    case R.id.answer1_3:
                        i.putExtra("answer1", answerQuiz1_3.getText().toString());
                        break;
                    case R.id.answer1_4:
                        i.putExtra("answer1", answerQuiz1_4.getText().toString());
                        break;
                }
                int answer2Id = answerQuiz2.getCheckedRadioButtonId();
                switch (answer2Id) {
                    case R.id.answer2_1:
                        i.putExtra("answer2", answerQuiz2_1.getText().toString());
                        break;
                    case R.id.answer2_2:
                        i.putExtra("answer2", answerQuiz2_2.getText().toString());
                        break;
                    case R.id.answer2_3:
                        i.putExtra("answer2", answerQuiz2_3.getText().toString());
                        break;
                    case R.id.answer2_4:
                        i.putExtra("answer2", answerQuiz2_4.getText().toString());
                        break;
                }

                int answer3Id = answerQuiz3.getCheckedRadioButtonId();
                switch (answer3Id) {
                    case R.id.answer3_1:
                        i.putExtra("answer3", answerQuiz3_1.getText().toString());
                        break;
                    case R.id.answer3_2:
                        i.putExtra("answer3", answerQuiz3_2.getText().toString());
                        break;
                    case R.id.answer3_3:
                        i.putExtra("answer3", answerQuiz3_3.getText().toString());
                        break;
                    case R.id.answer3_4:
                        i.putExtra("answer3", answerQuiz1_3.getText().toString());
                        break;
                }

                int answer4Id = answerQuiz4.getCheckedRadioButtonId();
                switch (answer4Id) {
                    case R.id.answer4_1:
                        i.putExtra("answer4", answerQuiz4_1.getText().toString());
                        break;
                    case R.id.answer4_2:
                        i.putExtra("answer4", answerQuiz4_2.getText().toString());
                        break;
                    case R.id.answer4_3:
                        i.putExtra("answer4", answerQuiz4_3.getText().toString());
                        break;
                    case R.id.answer4_4:
                        i.putExtra("answer4", answerQuiz4_4.getText().toString());
                        break;
                }

                int answer5Id = answerQuiz5.getCheckedRadioButtonId();
                switch (answer5Id) {
                    case R.id.answer5_1:
                        i.putExtra("answer5", answerQuiz5_1.getText().toString());
                        break;
                    case R.id.answer5_2:
                        i.putExtra("answer5", answerQuiz5_2.getText().toString());
                        break;
                    case R.id.answer5_3:
                        i.putExtra("answer5", answerQuiz5_3.getText().toString());
                        break;
                    case R.id.answer5_4:
                        i.putExtra("answer5", answerQuiz5_4.getText().toString());
                        break;
                }

                startActivity(i);

            }
        });
    }
}
