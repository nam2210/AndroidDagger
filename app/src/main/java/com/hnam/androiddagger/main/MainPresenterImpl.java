package com.hnam.androiddagger.main;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by nampham on 12/23/18.
 */
public class MainPresenterImpl implements MainContract.Presenter {
    private static final String TAG = MainPresenterImpl.class.getSimpleName();
    private MainContract.View mView;


    @Inject
    public MainPresenterImpl(MainContract.View view){
        mView = view;
        Log.e(TAG, "view="+mView.toString());
    }

    @Override
    public void mainTest() {
        Log.e(TAG, "MainPresenterImpl -> invoked");
    }
}
