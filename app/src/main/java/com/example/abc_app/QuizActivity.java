package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG="QuizActivity";
    Button option1,option2,option3,option4;
    public int count = 1;
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

       // TextView tv=findViewById(R.id.count);

    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(QuizActivity.this,MainActivity.class);
        ImageView image = findViewById(R.id.imageView);
        TextView mcqNo = findViewById(R.id.count);


        if (count == 1) {
            if (view.getId() == R.id.option2) {
                count++;
                mcqNo.setText(Integer.toString(count));
                option1.setText("APPLE");
                option2.setText("SUN");
                option3.setText("PEN");
                option4.setText("BALL");
                image.setImageResource(R.drawable.a);
            }
            else
            {
                Toast.makeText(getApplicationContext(),
                        "INCORRECT",
                        Toast.LENGTH_LONG)
                        .show();
            }
        }
        else if (count == 2) {
            if (view.getId() == R.id.option1) {
                count++;
                mcqNo.setText(Integer.toString(count));
                image.setImageResource(R.drawable.b);
                option1.setText("APPLE");
                option2.setText("SUN");
                option3.setText("PEN");
                option4.setText("BALL");
            }
            else
            {
                Toast.makeText(getApplicationContext(),
                        "INCORRECT",
                        Toast.LENGTH_LONG)
                        .show();
            }
        }
        else if (count == 3) {
            if (view.getId() == R.id.option4) {
                count++;
                mcqNo.setText(Integer.toString(count));
                image.setImageResource(R.drawable.p);
                option1.setText("APPLE");
                option2.setText("SUN");
                option3.setText("PEN");
                option4.setText("BALL");
            }
            else
            {
                Toast.makeText(getApplicationContext(),
                        "INCORRECT",
                        Toast.LENGTH_LONG)
                        .show();
            }
        }
        else if (count == 4) {
            if (view.getId() == R.id.option3) {

                mcqNo.setText(Integer.toString(count));
                Toast.makeText(getApplicationContext(),
                        "CONGRATULATIONS!!!",
                        Toast.LENGTH_LONG)
                        .show();
                startActivity(intent);
            }
            else
            {
                Toast.makeText(getApplicationContext(),
                        "INCORRECT",
                        Toast.LENGTH_LONG)
                        .show();
            }
        }
    }

//    @Override
//    protected void onStart()
//    {
//        super.onStart();
//        Log.d(TAG,"onStart Activity Quiz");
//    }
//
//    @Override
//    protected void onResume()
//    {
//        super.onResume();
//        Log.d(TAG,"onResume Activity Quiz");
//    }
//
//    @Override
//    protected void onPause()
//    {
//        super.onPause();
//        Log.d(TAG,"onPause Activity Quiz");
//    }
//    @Override
//    protected void onStop()
//    {
//        super.onStop();
//        Log.d(TAG,"onStop Activity Quiz");
//    }
//    @Override
//    protected void onDestroy()
//    {
//        super.onDestroy();
//        Log.d(TAG,"onDestroy Activity Quiz");
//    }
//
//    @Override
//    protected void onRestart()
//    {
//        super.onRestart();
//        Log.d(TAG,"onRestart Activity Quiz");
//    }
}