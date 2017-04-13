package com.easyandroid.lazyviewpagerdemo;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * package: com.ftgj.luoyangculture.base.BaseFragment
 * author: gyc
 * description:实现了懒加载的Fragment
 * time: create at 2017/4/10 16:15
 */

public abstract class BaseFragment extends Fragment {

    protected Dialog progressDialog;

    protected View mRootView;
    public Context mContext;
    protected boolean isVisible;
    private boolean isPrepared;
    private boolean isFirst = true;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            isVisible = true;
            lazyLoad();
        } else {
            isVisible = false;
            onInvisible();
        }
    }


    /**
     * 懒加载
     */
    protected void lazyLoad() {
        if (!isPrepared || !isVisible || !isFirst) {
            return;
        }
        initData();
        isFirst = false;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        initPrepare();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = initView(inflater, container, savedInstanceState);
        }
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        isPrepared = true;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            setUserVisibleHint(true);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    //--------------------------------method---------------------------//
    /**
     * 在onActivityCreated中调用的方法，可以用来进行初始化操作。
     */
    protected abstract void initPrepare();

    /**
     * fragment被设置为不可见时调用
     */
    protected abstract void onInvisible();

    /**
     * 这里获取数据，刷新界面
     */
    protected abstract void initData();

    /**
     * 初始化布局，请不要把耗时操作放在这个方法里，这个方法用来提供一个
     * 基本的布局而非一个完整的布局，以免ViewPager预加载消耗大量的资源。
     */
    protected abstract View initView(LayoutInflater inflater,
                                     @Nullable ViewGroup container,
                                     @Nullable Bundle savedInstanceState);

    /**
     * 显示Loading弹框
     */
    public void showLoading(){
        if (progressDialog == null) {
//            progressDialog = ViewUtils.createDialog(getActivity(), "");
        }
        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    /**
     * 隐藏Loading弹框
     */
    public void stopLoading() {
        if (progressDialog == null) {
            return;
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
//        getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
//        getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

}
