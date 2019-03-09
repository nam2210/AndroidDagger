package com.hnam.androiddagger.di.ChatComponent;


import com.hnam.androiddagger.chat.ChatActivity;
import com.hnam.androiddagger.chat.ChatScreenModule;
import com.hnam.androiddagger.main.MainScreenActivity;
import com.hnam.androiddagger.main.MainScreenModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by nampham on 12/23/18.
 */
@Module
public abstract class ChatActivityBuilder {

    @ContributesAndroidInjector(modules = ChatScreenModule.class)
    abstract ChatActivity bindChatActivity();

}