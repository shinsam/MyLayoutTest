package com.example.mylayouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button main_btn1, main_btn2, main_btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_btn1 = findViewById(R.id.main_btn1);
        main_btn2 = findViewById(R.id.main_btn2);
        main_btn3 = findViewById(R.id.main_btn3);

        //내용을 수정해봅니다.
    }


}