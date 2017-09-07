package com.harvy.almeidaquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Home (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void InfoTech (View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void InfoSys (View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}