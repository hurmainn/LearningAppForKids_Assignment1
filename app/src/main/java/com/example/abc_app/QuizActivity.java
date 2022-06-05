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
        ImageView image=findViewById(R.id.imageView);
        TextView mcqNo=findViewById(R.id.count);
        int count=1;

        if (count==1)
        {
            mcqNo.setText(count);
            image.setImageResource(R.drawable.s);
            switch (view.getId()) {
                case R.id.option1: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();

                    break;
                }
                case R.id.option2:      //correct option
                {
                    Toast.makeText(getApplicationContext(),
                            "CORRECT OPTION",
                            Toast.LENGTH_LONG).show();
                    count += 1;
                    break;
                }
                case R.id.option3: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
                case R.id.option4: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            }
        }
        else if(count==2)
        {
            mcqNo.setText(count);
            image.setImageResource(R.drawable.a);
            switch (view.getId()) {
                case R.id.option1: {
                    Toast.makeText(getApplicationContext(),
                            "CORRECT OPTION",
                            Toast.LENGTH_LONG).show();
                    count += 1;
                    break;
                }
                case R.id.option2:      //correct option
                {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
                case R.id.option3: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
                case R.id.option4: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            }
            count+=1;
        }
        else if(count==3)
        {
            mcqNo.setText(count);
            image.setImageResource(R.drawable.p);
            switch (view.getId()) {
                case R.id.option1: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();

                    break;
                }
                case R.id.option2:      //correct option
                {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
                case R.id.option3: {
                    Toast.makeText(getApplicationContext(),
                            "RIGHT OPTION",
                            Toast.LENGTH_LONG).show();
                    count += 1;
                    break;
                }
                case R.id.option4: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            }
            count+=1;
        }
        else if(count==4)
        {
            mcqNo.setText(count);
            image.setImageResource(R.drawable.b);
            switch (view.getId()) {
                case R.id.option1: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();

                    break;
                }
                case R.id.option2:      //correct option
                {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
                case R.id.option3: {
                    Toast.makeText(getApplicationContext(),
                            "WRONG OPTION",
                            Toast.LENGTH_LONG).show();
                    break;
                }
                case R.id.option4: {
                    Toast.makeText(getApplicationContext(),
                            "CORRECT OPTION",
                            Toast.LENGTH_LONG).show();
                    count += 1;
                    break;
                }
            }
            count+=1;
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