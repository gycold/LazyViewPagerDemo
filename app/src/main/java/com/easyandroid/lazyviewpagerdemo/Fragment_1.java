package com.easyandroid.lazyviewpagerdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_1 extends Fragment {

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.d("Fragment_1", "------->" + "   " + isVisibleToUser);
    }

    @Override
    public boolean getUserVisibleHint() {
        Log.d("Fragment_1", "------->" + "   " + "getUserVisibleHint");
        return super.getUserVisibleHint();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment_1", "------->" + "   " + "1-->onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment_1", "------->" + "   " + "2-->onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Fragment_1", "------->" + "   " + "3-->onCreateView");
        return inflater.inflate(R.layout.fragment_fragment_1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment_1", "------->" + "   " + "4-->onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment_1", "------->" + "   " + "5-->onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment_1", "------->" + "   " + "6-->onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment_1", "------->" + "   " + "7-->onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment_1", "------->" + "   " + "8-->onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment_1", "------->" + "   " + "9-->onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment_1", "------->" + "   " + "10-->onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment_1", "------->" + "   " + "11-->onDetach");
    }

}
