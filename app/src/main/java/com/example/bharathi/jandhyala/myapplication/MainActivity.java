package com.example.bharathi.jandhyala.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox surfBox;
    CheckBox readBox;
    CheckBox playBox;
    CheckBox tvBox;
    CheckBox codeBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surfBox = findViewById(R.id.surfHobby);
        readBox = findViewById(R.id.readHobby);
        playBox = findViewById(R.id.playHobby);
        tvBox = findViewById(R.id.watchHobby);
        codeBox = findViewById(R.id.practiceHobby);
    }
}
