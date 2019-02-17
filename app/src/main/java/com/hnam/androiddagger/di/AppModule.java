package com.hnam.androiddagger.di;

import android.app.Application;
import android.content.Context;

import com.hnam.androiddagger.database.ApiService;
import com.hnam.androiddagger.database.DBService;
import com.hnam.androiddagger.di.UserComponent.UserComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nampham on 12/23/18.
 */
@Module(subcomponents = UserComponent.class)
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    ApiService provideApiService() {
        return new ApiService();
    }

    @Provides
    @Singleton
    DBService provideDBService(Context context) {
        return new DBService(context);
    }
}
