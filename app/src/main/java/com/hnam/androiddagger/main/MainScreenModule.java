package com.hnam.androiddagger.main;

import com.hnam.androiddagger.di.UserComponent.UserScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nampham on 12/23/18.
 */
@Module
public class MainScreenModule {

    @Provides
    public MainContract.Presenter providePresenter(MainPresenterImpl presenter){
        return presenter;
    }

    @Provides
    public MainContract.View provideView(MainScreenActivity activity){
        return activity;
    }
}
