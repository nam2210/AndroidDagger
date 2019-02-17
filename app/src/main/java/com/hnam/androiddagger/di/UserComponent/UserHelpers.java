package com.hnam.androiddagger.di.UserComponent;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by nampham on 2/17/19.
 */
@UserScope
public class UserHelpers {
    private static final String TAG = UserHelpers.class.getSimpleName();

    @Inject
    public UserHelpers(){

    }

    public void test(){
        Log.e(TAG," userHelpers test");
    }
}
