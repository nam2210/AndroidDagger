package com.hnam.androiddagger.di.UserComponent;

import com.hnam.androiddagger.detail.DetailScreenActivity;
import com.hnam.androiddagger.di.ActivityScope;
import com.hnam.androiddagger.main.MainScreenActivity;
import com.hnam.androiddagger.main.MainScreenModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by nampham on 2/17/19.
 */
@Module
public abstract class UserBinding {

    @ContributesAndroidInjector
    abstract DetailScreenActivity bindDetailScreenActivity();
}
