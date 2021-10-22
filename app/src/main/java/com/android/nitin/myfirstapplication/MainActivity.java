package com.android.nitin.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hi-World");
        int count=0;
        count+=5;
        System.out.println("Hi World"+count);

      //  TextView tv=findViewById(R.id);
       // tv.setText("Hello World");
    }
}