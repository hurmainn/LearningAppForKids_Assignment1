package com.example.abc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button r=findViewById(R.id.R);
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
        r.setOnClickListener(this);
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
        Intent intent=new Intent(MainActivity.this,PicturePageActivity.class);
        switch(view.getId())
        {
            case R.id.A:
            {
                intent.putExtra("letter","a");
                startActivity(intent);
                break;    }
            case R.id.B:
            {
                intent.putExtra("letter","b");
                startActivity(intent);
                break;
            }
            case R.id.C:
            {
                intent.putExtra("letter","c");
                startActivity(intent);
                break;
            }
            case R.id.D:
            {
                intent.putExtra("letter","d");
                startActivity(intent);
                break;
            }
            case R.id.E:
            {
                intent.putExtra("letter","e");
                startActivity(intent);
                break;
            }
            case R.id.F:
            {
                intent.putExtra("letter","f");
                startActivity(intent);
                break;
            }
            case R.id.G:
            {
                intent.putExtra("letter","g");
                startActivity(intent);
                break;
            }
            case R.id.H:
            {
                intent.putExtra("letter","h");
                startActivity(intent);
                break;
            }
            case R.id.I:
            {
                intent.putExtra("letter","i");
                startActivity(intent);
                break;
            }
            case R.id.J:
            {
                intent.putExtra("letter","j");
                startActivity(intent);
                break;
            }
            case R.id.K:
            {
                intent.putExtra("letter","k");
                startActivity(intent);
                break;
            }
            case R.id.L:
            {
                intent.putExtra("letter","l");
                startActivity(intent);
                break;
            }
            case R.id.M:
            {
                intent.putExtra("letter","m");
                startActivity(intent);
                break;
            }
            case R.id.N:
            {
                intent.putExtra("letter","n");
                startActivity(intent);
                break;
            }
            case R.id.O:
            {
                intent.putExtra("letter","o");
                startActivity(intent);
                break;
            }
            case R.id.P:
            {
                intent.putExtra("letter","p");
                startActivity(intent);
                break;
            }
            case R.id.Q:
            {
                intent.putExtra("letter","q");
                startActivity(intent);
                break;
            }
            case R.id.R:
            {
                intent.putExtra("letter","r");
                startActivity(intent);
                break;
            }
            case R.id.S:
            {
                intent.putExtra("letter","s");
                startActivity(intent);
                break;
            }
            case R.id.T:
            {
                intent.putExtra("letter","t");
                startActivity(intent);
                break;
            }
            case R.id.U:
            {
                intent.putExtra("letter","u");
                startActivity(intent);
                break;
            }
            case R.id.V:
            {
                intent.putExtra("letter","v");
                startActivity(intent);
                break;
            }
            case R.id.W:
            {
                intent.putExtra("letter","w");
                startActivity(intent);
                break;
            }
            case R.id.X:
            {
                intent.putExtra("letter","x");
                startActivity(intent);
                break;
            }
            case R.id.Y:
            {
                intent.putExtra("letter","y");
                startActivity(intent);
                break;
            }
            case R.id.Z:
        {
            intent.putExtra("letter","z");
            startActivity(intent);
            break;
        }


        }

    }
}