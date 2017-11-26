package com.example.fatur.basketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
int a=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ScoreA(View view){

    }
    public void threePointsA(Button button){
        a=a+3;
    }
    public void twoPointsB(Button button){
        a=a+2;
    }
    public void threePointsB(Button button){
        b=b+3
    }
    public void twoPointsB(Button button){
        
    }
}
