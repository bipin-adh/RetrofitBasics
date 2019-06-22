package com.example.retrofitbasics;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * ----------Adding dagger to retrofit example . STEP 1 --------------:
 * This module will provide the Context.
 * We know that we need Context everywhere, and in Retrofit as well we need the context object.
 * And as the DI rule says we need an outsider to supply the objects,
 * so here we will create this module that will give us the Context.
 */

@Module
public class AppModule {

    private Application mApplication;

    AppModule(Application mApplication) {
        this.mApplication = mApplication;

    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
