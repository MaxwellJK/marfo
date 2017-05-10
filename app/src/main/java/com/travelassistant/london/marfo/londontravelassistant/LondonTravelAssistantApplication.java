package com.travelassistant.london.marfo.londontravelassistant;

import android.app.Application;

/**
 * Created by martafoderaro on 01/05/2017.
 */

public class LondonTravelAssistantApplication extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent.create();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
