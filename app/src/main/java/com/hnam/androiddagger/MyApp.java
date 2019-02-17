package com.hnam.androiddagger;

import android.app.Activity;
import android.app.Application;


import com.hnam.androiddagger.di.DaggerAppComponent;
import com.hnam.androiddagger.di.UserComponent.UserManager;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by nampham on 12/23/18.
 */
public class MyApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Inject
    UserManager userManager;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent
                .builder()
                .application(this)
                .build().inject(this);
    }

    public UserManager getUserManager(){
        return userManager;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return userManager.activityInjector();
    }
}
