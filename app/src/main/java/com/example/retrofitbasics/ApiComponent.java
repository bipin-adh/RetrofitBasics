package com.example.retrofitbasics;


import javax.inject.Singleton;

import dagger.Component;

/**
 * ---- Adding dagger to retrofit example : STEP 3 -------
 *  we will inject in the MainActivity.
 *  We also define all the modules using the @Component annotation .
 *
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
}
