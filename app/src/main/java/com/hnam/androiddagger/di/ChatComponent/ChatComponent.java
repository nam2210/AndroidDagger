package com.hnam.androiddagger.di.ChatComponent;

import android.app.Application;

import com.hnam.androiddagger.MyApp;
import com.hnam.androiddagger.di.ActivityBuilder;
import com.hnam.androiddagger.di.AppComponent;
import com.hnam.androiddagger.di.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by nampham on 12/23/18.
 */
@ChatScope
@Component(modules = {ChatModule.class, ChatActivityBuilder.class})
public interface ChatComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        ChatComponent.Builder application(Application application);

        ChatComponent build();
    }


}
