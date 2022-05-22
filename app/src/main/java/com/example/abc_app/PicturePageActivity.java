package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class PicturePageActivity extends AppCompatActivity {
    private static final String TAG="PicturePageActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_page);

//int id;
        String idd =getIntent().getStringExtra("letter");
      //  id=getResources().getIdentifier("letter","drawable","com.example.abc_app");
        ImageView imageView;
    imageView=findViewById(R.id.image);
    //imageView.setImageResource(id);

        //using if else conditions
        if(idd.equals("a"))
            imageView.setImageResource(R.drawable.a);
        else if(idd.equals("b"))
            imageView.setImageResource(R.drawable.b);
        else if(idd.equals("c"))
            imageView.setImageResource(R.drawable.c);
        else if(idd.equals("d"))
            imageView.setImageResource(R.drawable.d);
        else if(idd.equals("e"))
            imageView.setImageResource(R.drawable.e);
        else if(idd.equals("f"))
            imageView.setImageResource(R.drawable.f);
        else if(idd.equals("g"))
            imageView.setImageResource(R.drawable.g);
        else if(idd.equals("h"))
            imageView.setImageResource(R.drawable.h);
        else if(idd.equals("i"))
            imageView.setImageResource(R.drawable.i);
        else if(idd.equals("j"))
            imageView.setImageResource(R.drawable.j);
        else if(idd.equals("k"))
            imageView.setImageResource(R.drawable.k);
        else if(idd.equals("l"))
            imageView.setImageResource(R.drawable.l);
        else if(idd.equals("m"))
            imageView.setImageResource(R.drawable.m);
        else if(idd.equals("n"))
            imageView.setImageResource(R.drawable.n);
        else if(idd.equals("o"))
            imageView.setImageResource(R.drawable.o);
        else if(idd.equals("p"))
            imageView.setImageResource(R.drawable.p);
        else if(idd.equals("q"))
            imageView.setImageResource(R.drawable.q);
        else if(idd.equals("r"))
            imageView.setImageResource(R.drawable.r);
        else if(idd.equals("s"))
            imageView.setImageResource(R.drawable.s);
        else if(idd.equals("t"))
            imageView.setImageResource(R.drawable.t);
        else if(idd.equals("u"))
            imageView.setImageResource(R.drawable.u);
        else if(idd.equals("v"))
            imageView.setImageResource(R.drawable.v);
        else if(idd.equals("w"))
            imageView.setImageResource(R.drawable.w);
        else if(idd.equals("x"))
            imageView.setImageResource(R.drawable.x);
        else if(idd.equals("y"))
            imageView.setImageResource(R.drawable.y);
        else if(idd.equals("z"))
            imageView.setImageResource(R.drawable.z);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart Activity PicturePage");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume Activity PicturePage");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause Activity PicturePage");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop Activity PicturePage");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy Activity PicturePage");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart Activity PicturePage");
    }
}