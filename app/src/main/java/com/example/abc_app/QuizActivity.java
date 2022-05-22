package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
        Intent intent=new Intent(QuizActivity.this,SuccessFailureActivity.class);
        //intent.putExtra("option","wrong");
        int count=1;
        TextView text=findViewById(R.id.count);
        ImageView image=findViewById(R.id.imageView);
        switch(view.getId())
        {

            case R.id.option1:
            {
                intent.putExtra("option","wrong1");
                startActivity(intent);
                break;
            }
            case R.id.option2:      //correct option
            {
                intent.putExtra("option","right");
                startActivity(intent);
                break;
            }
            case R.id.option3:
            {
                intent.putExtra("option","wrong2");
                startActivity(intent);
                break;
            }
            case R.id.option4:
            {
                intent.putExtra("option","wrong3");
                startActivity(intent);
                break;
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