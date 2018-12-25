package com.hnam.androiddagger.database;

import android.util.Log;

import com.hnam.androiddagger.di.ChatComponent.ChatScope;

import javax.inject.Inject;

/**
 * Created by nampham on 12/25/18.
 */
@ChatScope
public class ChatService {
    private static final String TAG = ChatService.class.getSimpleName();

    @Inject
    public ChatService(){

    }

    public void test(){
        Log.e(TAG, "ChatService() -> test");
    }
}
