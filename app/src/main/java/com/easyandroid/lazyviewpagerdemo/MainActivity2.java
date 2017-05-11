package com.easyandroid.lazyviewpagerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.easytools.tools.DialogUtil;

public class MainActivity2 extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Activity", "------->" + "   " + "onCreate();");
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtil.showDialog(MainActivity2.this, "测试的一个dialog");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
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
