package com.travelassistant.london.marfo.londontravelassistant.rpc;

import android.support.annotation.NonNull;
import android.util.Log;

import com.travelassistant.london.marfo.londontravelassistant.BuildConfig;
import com.travelassistant.london.marfo.londontravelassistant.air.RequestAirQualityListener;
import com.travelassistant.london.marfo.londontravelassistant.rpc.api.TFLServerApi;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.AirQuality;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.ArrivalResponse;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.RouteSequence;
import com.travelassistant.london.marfo.londontravelassistant.ui.home.RequestStationsListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by martafoderaro on 01/05/2017.
 */

public class TFLRequestManager {
    private static final String TAG = "TFLRequestManager";

    private Call<RouteSequence> call;

    private Call<List<ArrivalResponse>> call1;

    private Call<AirQuality> call2;
    
    private TFLServerApi tflServerApi;

    public TFLRequestManager(Retrofit retrofit) {
        tflServerApi = retrofit.create(TFLServerApi.class);
    }

    public void getStatusLondonBuses(String id, String direction, final RequestStationsListener listener) {
        call = tflServerApi.getStatusLondonBuses(id, direction, "Regular", true, BuildConfig.TFL_APP_ID, BuildConfig.TFL_APP_KEY);
        call.enqueue(new Callback<RouteSequence>() {
            @Override
            public void onResponse(Call<RouteSequence> call, Response<RouteSequence> response) {
                Log.d(TAG, "Call is successful: " + response.isSuccessful());
                if (response.body() != null) {
                    listener.onRequestStationSucceded(response.body().stations);
                }

            }

            @Override
            public void onFailure(Call<RouteSequence> call, Throwable t) {
                Log.d(TAG, "Call is NOT successful / Error message: " + t.getMessage());
            }
        });
    }

    public void getBusArrivalTimes(@NonNull String id, final RequestStationsListener listener) {
        call1 = tflServerApi.getBusArrivalTimes(id, BuildConfig.TFL_APP_ID, BuildConfig.TFL_APP_KEY);
        call1.enqueue(new Callback<List<ArrivalResponse>>() {
            @Override
            public void onResponse(Call<List<ArrivalResponse>> call, Response<List<ArrivalResponse>> response) {
                if (response.isSuccessful()) {
                    listener.onArrivalTimesReceived(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<ArrivalResponse>> call, Throwable t) {

            }
        });
    }
    
    public void getAirQualityStatus(final RequestAirQualityListener listener) {
    	call2 = tflServerApi.getAirQualityStatus(BuildConfig.TFL_APP_ID, BuildConfig.TFL_APP_KEY);
    	call2.enqueue(new Callback<AirQuality>() {
            @Override
            public void onResponse(Call<AirQuality> call, Response<AirQuality> response) {
                Log.d(TAG, "Call is successfull: " + response.isSuccessful());
                if (response.body() != null) {
                    listener.onAirQualityRequestSuccess(response.body());
                }

            }

            @Override
            public void onFailure(Call<AirQuality> call, Throwable t) {
                Log.d(TAG, "Call is NOT successfull / Error message: " + t.getMessage());
                listener.onAirQualityRequestFailed();
            }
        });
    }
}
