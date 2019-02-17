package com.hnam.androiddagger.di.UserComponent;

import com.hnam.androiddagger.database.ChatService;
import com.hnam.androiddagger.di.ChatComponent.ChatScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nampham on 2/17/19.
 */
@Module
public class UserModule {

    @Provides
    @UserScope
    UserHelpers provideUserHelpers() {
        return new UserHelpers();
    }
}
