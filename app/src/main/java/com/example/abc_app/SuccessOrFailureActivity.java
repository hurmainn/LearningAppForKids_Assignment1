package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SuccessOrFailureActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_or_failure);

        String idd =getIntent().getStringExtra("option");
       textView=findViewById(R.id.DisplayText);

        if(idd.equals("right"))
            textView.setText("!! CORRECT OPTION !!");
        else if(idd.equals("wrong"))
            textView.setText("!! INCORRECT OPTION SELECTED !!");

    }
}