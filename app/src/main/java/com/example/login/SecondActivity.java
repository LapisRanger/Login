package com.example.login;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ll);
        Log.d("LifeCircle","--onCreate2--");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCircle","--onStop2--");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCircle","--onDestroy2--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCircle", "--onPause2--");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCircle","--onResume2--");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCircle","--onStart2--");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCircle","--onRestart2--");
    }
}
