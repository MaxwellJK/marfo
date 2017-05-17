package com.travelassistant.london.marfo.londontravelassistant.air;

import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.AirQuality;

/**
 * Created by martafoderaro on 17/05/2017.
 */

public interface RequestAirQualityListener {
    void onAirQualityRequestSuccess(AirQuality airQuality);
    void onAirQualityRequestFailed();
}
