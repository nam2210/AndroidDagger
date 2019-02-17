package com.hnam.androiddagger.di.UserComponent;

import android.app.Activity;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by nampham on 2/17/19.
 */
@Singleton
public class UserManager implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    private UserComponent.Builder builder;
    private UserComponent component;

    @Inject
    public UserManager(UserComponent.Builder builder){
        this.builder = builder;
    }

    public void createComponent(){
        this.component = builder.build();
        this.component.inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
