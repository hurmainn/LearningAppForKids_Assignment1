package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Button option1,option2,option3,option4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(QuizActivity.this,SuccessOrFailureActivity.class);
        intent.putExtra("option","wrong");
        switch(view.getId())
        {
            case R.id.option1:
            {
                startActivity(intent);
                break;
            }
            case R.id.option2:
            {
                intent.putExtra("option","right");
                startActivity(intent);
                break;
            }
            case R.id.option3:
            {
                startActivity(intent);
                break;
            }
            case R.id.option4:
            {
                startActivity(intent);
                break;
            }
        }
    }
}