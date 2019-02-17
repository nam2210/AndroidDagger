package com.hnam.androiddagger.di.UserComponent;

import android.app.Application;

import com.hnam.androiddagger.di.ChatComponent.ChatComponent;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;

/**
 * Created by nampham on 2/17/19.
 */
@UserScope
@Subcomponent(modules = {UserModule.class, AndroidInjectionModule.class, UserBinding.class})
public interface UserComponent {

    void inject(UserManager userManager);

    @Subcomponent.Builder
    interface Builder {
        UserComponent build();
    }
}
