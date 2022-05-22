package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SuccessFailureActivity extends AppCompatActivity {
    private static final String TAG="SuccessFailureActivity";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_or_failure);

        String idd =getIntent().getStringExtra("option");
       textView=findViewById(R.id.DisplayText);

        if(idd.equals("right"))
            textView.setText("!! CORRECT OPTION !!");
        else if(idd.equals("wrong1"))
            textView.setText("!! INCORRECT OPTION SELECTED !!");
        else if(idd.equals("wrong2"))
            textView.setText("!! INCORRECT OPTION SELECTED !!");
        else if(idd.equals("wrong3"))
            textView.setText("!! INCORRECT OPTION SELECTED !!");

    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart Activity SuccessFailure");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume Activity SuccessFailure");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause Activity SuccessFailure");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop Activity SuccessFailure");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy Activity SuccessFailure");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart Activity SuccessFailure");
    }
}