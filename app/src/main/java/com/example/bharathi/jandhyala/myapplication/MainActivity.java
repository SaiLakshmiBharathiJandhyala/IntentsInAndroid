package com.example.bharathi.jandhyala.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

    public void register(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(surfBox.getText().toString(), surfBox.isChecked());
        intent.putExtra(readBox.getText().toString(), readBox.isChecked());
        intent.putExtra(playBox.getText().toString(), playBox.isChecked());
        intent.putExtra(tvBox.getText().toString(), tvBox.isChecked());
        intent.putExtra(codeBox.getText().toString(), codeBox.isChecked());
    }
}
