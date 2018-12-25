package com.hnam.androiddagger.chat;

import android.util.Log;

import com.hnam.androiddagger.di.ChatComponent.ChatScope;
import com.hnam.androiddagger.main.MainContract;

import javax.inject.Inject;

/**
 * Created by nampham on 12/23/18.
 */
@ChatScope
public class ChatPresenterImpl implements ChatContract.Presenter {
    private static final String TAG = ChatPresenterImpl.class.getSimpleName();

    @Inject
    public ChatPresenterImpl(){

    }

    @Override
    public void mainTest() {
        Log.e(TAG, "ChatPresenterImpl -> invoked");
    }
}
