package com.example.bharathi.jandhyala.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.surfHobby)
    CheckBox surfBox;
    @BindView(R.id.readHobby)
    CheckBox readBox;
    @BindView(R.id.playHobby)
    CheckBox playBox;
    @BindView(R.id.watchHobby)
    CheckBox tvBox;
    @BindView(R.id.practiceHobby)
    CheckBox codeBox;
    @BindView(R.id.name)
    TextInputEditText studentName;
    @BindView(R.id.rollNumber)
    TextInputEditText rollNum;
    @BindView(R.id.phoneNumber)
    TextInputEditText phoneNum;
    @BindView(R.id.emailAddress)
    TextInputEditText mailId;
    @BindView(R.id.feedback)
    TextInputEditText feedback;
    @BindView(R.id.branchSpinner)
    Spinner branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        final Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(surfBox.getText().toString(), surfBox.isChecked());
        intent.putExtra(readBox.getText().toString(), readBox.isChecked());
        intent.putExtra(playBox.getText().toString(), playBox.isChecked());
        intent.putExtra(tvBox.getText().toString(), tvBox.isChecked());
        intent.putExtra(codeBox.getText().toString(), codeBox.isChecked());
        intent.putExtra(studentName.getHint().toString(), studentName.getText().toString());
        intent.putExtra(phoneNum.getHint().toString(), phoneNum.getText().toString());
        intent.putExtra(mailId.getHint().toString(), mailId.getText().toString());
        branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                intent.putExtra("branch", branch.getChildAt(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        startActivity(intent);
    }
}
