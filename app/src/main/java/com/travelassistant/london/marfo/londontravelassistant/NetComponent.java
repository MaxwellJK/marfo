package com.travelassistant.london.marfo.londontravelassistant;

import com.travelassistant.london.marfo.londontravelassistant.ui.home.MapsActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by martafoderaro on 01/05/2017.
 */
@Singleton
@Component(modules={NetModule.class})
public interface NetComponent {
    void inject(MapsActivity mapsActivity);
}
