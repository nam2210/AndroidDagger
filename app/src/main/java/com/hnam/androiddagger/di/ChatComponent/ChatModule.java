package com.hnam.androiddagger.di.ChatComponent;

import android.content.Context;

import com.hnam.androiddagger.database.ChatService;
import com.hnam.androiddagger.database.DBService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nampham on 12/25/18.
 */
@Module
public class ChatModule {

    @Provides
    @ChatScope
    ChatService provideChatService() {
        return new ChatService();
    }
}
