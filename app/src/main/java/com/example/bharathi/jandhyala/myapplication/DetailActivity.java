package com.example.bharathi.jandhyala.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.feedbacknote)
    TextView textView;
    @BindView(R.id.feedbacknote)
    TextView textView1;
    @BindView(R.id.feedbacknote)
    TextView textView2;
    @BindView(R.id.feedbacknote)
    TextView textView3;
    @BindView(R.id.feedbacknote)
    TextView textView4;
    @BindView(R.id.feedbacknote)
    TextView textView5;
    @BindView(R.id.feedbacknote)
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
