package com.example.dharun.gnproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b_continue;
    TextView tv_questions;
    EditText et_answer;

    List<Item> questions;
    int ourQuestion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_continue = (Button) findViewById(R.id.b_continue);
        tv_questions = (TextView) findViewById(R.id.tv_question);
        et_answer = (EditText) findViewById(R.id.et_answer);

        b_continue.setVisibility(View.INVISIBLE);

        questions = new ArrayList<>();

        for(int i = 0; i < Database.questions.length; i++){
            questions.add(new Item(Database.questions[i], Database.answers[i]));
        }

        Collections.shuffle(questions);

        tv_questions.setText(questions.get(ourQuestion).getQuestion());

        et_answer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(et_answer.getText().toString().equalsIgnoreCase(questions.get(ourQuestion).getAnswer())){
                    b_continue.setVisibility(View.VISIBLE);
                } else{
                    b_continue.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });




        b_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ourQuestion < Database.questions.length -1) {

                    ourQuestion++;
                    tv_questions.setText(questions.get(ourQuestion).getQuestion());
                    b_continue.setVisibility(View.INVISIBLE);
                    et_answer.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "You have Completed the General Knowledge Timed Quiz", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

}
