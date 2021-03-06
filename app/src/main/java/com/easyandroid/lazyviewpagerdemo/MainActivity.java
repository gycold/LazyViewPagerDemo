package com.easyandroid.lazyviewpagerdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity", "------->" + "   " + "onCreate();");
        initView();
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp = (ViewPager) findViewById(R.id.vp);

        List<Fragment> data = new ArrayList<>();
        data.add(new Fragment_1());
        data.add(new Fragment_2());
        data.add(new Fragment_3());
        data.add(new Fragment_4());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), data);
        vp.setAdapter(adapter);

        tab.setupWithViewPager(vp);
        for (int i = 0 ; i < adapter.getCount() ; i ++){
            tab.getTabAt(i).setText("Tab_" + (i + 1));
        }
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
