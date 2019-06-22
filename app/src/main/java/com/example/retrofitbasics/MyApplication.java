package com.example.retrofitbasics;

import android.app.Application;

/**
 * ---- Adding dagger to retrofit example : STEP 4 -------
 */
public class MyApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
                .build();
    }

    public ApiComponent getNetComponent(){
        return mApiComponent;
    }
}
