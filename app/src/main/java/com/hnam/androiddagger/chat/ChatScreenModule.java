package com.hnam.androiddagger.chat;

import com.hnam.androiddagger.main.MainContract;
import com.hnam.androiddagger.main.MainPresenterImpl;
import com.hnam.androiddagger.main.MainScreenActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nampham on 12/23/18.
 */
@Module
public class ChatScreenModule {

    @Provides
    public ChatContract.Presenter providePresenter(ChatPresenterImpl presenter){
        return presenter;
    }

//    @Provides
//    public ChatContract.View provideView(MainScreenActivity activity){
//        return activity;
//    }
}
