package com.example.helpmeson;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sp=getSharedPreferences("Pref",MODE_PRIVATE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(sp.contains("first")){
                    Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else{
                    Intent intent=new Intent(MainActivity.this,AddDetails.class);
                    startActivity(intent);
                }
            }
        }, 2000);
    }
}