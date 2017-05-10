package com.travelassistant.london.marfo.londontravelassistant;

import com.travelassistant.london.marfo.londontravelassistant.rpc.TFLRequestManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by martafoderaro on 01/05/2017.
 */
@Module
public class NetModule {

    @Provides
    @Singleton
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl(BuildConfig.TFL_LINE_URL)
                .build();
    }

    @Provides
    @Singleton
    public TFLRequestManager provideRequestManager() {
        return new TFLRequestManager(provideRetrofit());
    }
}
