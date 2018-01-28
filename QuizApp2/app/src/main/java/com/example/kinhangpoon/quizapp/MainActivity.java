package com.example.kinhangpoon.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // enter player name
    EditText playerName;
    // enter button
    Button enterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerName = findViewById(R.id.editTextPlayer);
        enterButton = findViewById(R.id.buttonEnter);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = playerName.getText().toString();
                Intent i = new Intent(MainActivity.this,quizz.class);
                i.putExtra("Name",name);
                startActivity(i);
            }
        });
    }
}
