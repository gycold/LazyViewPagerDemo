package com.easyandroid.lazyviewpagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("Activity", "------->" + "   " + "onCreate();");
        initView();
    }

    private void initView() {

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity", "------->" + "   " + "onStart();");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity", "------->" + "   " + "onRestart();");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity", "------->" + "   " + "onResume();");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity", "------->" + "   " + "onPause();");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity", "------->" + "   " + "onStop();");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity", "------->" + "   " + "onDestroy();");
    }
}
