package com.hnam.androiddagger.di;


import com.hnam.androiddagger.di.UserComponent.UserComponent;
import com.hnam.androiddagger.main.MainScreenModule;
import com.hnam.androiddagger.main.MainScreenActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by nampham on 12/23/18.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainScreenModule.class)
    abstract MainScreenActivity bindMainActivity();

}