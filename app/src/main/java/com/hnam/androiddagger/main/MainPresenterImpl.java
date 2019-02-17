package com.hnam.androiddagger.main;

import android.util.Log;

import com.hnam.androiddagger.di.UserComponent.UserScope;

import javax.inject.Inject;

/**
 * Created by nampham on 12/23/18.
 */

public class MainPresenterImpl implements MainContract.Presenter {
    private static final String TAG = MainPresenterImpl.class.getSimpleName();

    @Inject
    public MainPresenterImpl(){

    }

    @Override
    public void mainTest() {
        Log.e(TAG, "MainPresenterImpl -> invoked");
    }
}
