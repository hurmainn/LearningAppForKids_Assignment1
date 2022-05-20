package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        //giving variables to buttons
       Button A=findViewById(R.id.A);
        Button B=findViewById(R.id.B);
        Button C=findViewById(R.id.C);
        Button D=findViewById(R.id.D);
        Button E=findViewById(R.id.E);
        Button F=findViewById(R.id.F);
        Button G=findViewById(R.id.G);
        Button H=findViewById(R.id.H);
        Button I=findViewById(R.id.I);
        Button J=findViewById(R.id.J);
        Button K=findViewById(R.id.K);
        Button L=findViewById(R.id.L);
        Button M=findViewById(R.id.M);
        Button N=findViewById(R.id.N);
        Button O=findViewById(R.id.O);
        Button P=findViewById(R.id.P);
        Button Q=findViewById(R.id.Q);
        Button R_=findViewById(R.id.S);
        Button S=findViewById(R.id.S);
        Button T=findViewById(R.id.T);
        Button U=findViewById(R.id.U);
        Button V=findViewById(R.id.V);
        Button W=findViewById(R.id.W);
        Button X=findViewById(R.id.X);
        Button Y=findViewById(R.id.Y);
        Button Z=findViewById(R.id.Z);

        //setting on click listeners
        A.setOnClickListener(this);
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        E.setOnClickListener(this);
        F.setOnClickListener(this);
        G.setOnClickListener(this);
        H.setOnClickListener(this);
        I.setOnClickListener(this);
        J.setOnClickListener(this);
        K.setOnClickListener(this);
        L.setOnClickListener(this);
        M.setOnClickListener(this);
        N.setOnClickListener(this);
        O.setOnClickListener(this);
        P.setOnClickListener(this);
        Q.setOnClickListener(this);
        R_.setOnClickListener(this);
        S.setOnClickListener(this);
        T.setOnClickListener(this);
        U.setOnClickListener(this);
        V.setOnClickListener(this);
        W.setOnClickListener(this);
        X.setOnClickListener(this);
        Y.setOnClickListener(this);
        Z.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {

        }

    }
}