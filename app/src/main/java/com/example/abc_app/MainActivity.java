package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating alphabets array
        String[] alphabets={ };
        alphabets = new String[26];
        char ascii=65;
        for(int i=0;i<26;i++)
        {
            alphabets[i]=Character.toString(ascii);         //fill the array with alphabets
        }


    }
}