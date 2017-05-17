package com.travelassistant.london.marfo.londontravelassistant.ui.home;

import android.support.annotation.NonNull;

import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.ArrivalResponse;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.Station;

import java.util.List;

/**
 * Created by martafoderaro on 07/05/2017.
 */

public interface RequestStationsListener {
    void onRequestStationSucceded(@NonNull List<Station> stations);
    void onRequestStationFailed();

    void onArrivalTimesReceived(List<ArrivalResponse> arrivalResponseList);
}
