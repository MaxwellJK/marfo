package com.travelassistant.london.marfo.londontravelassistant.rpc.api;

import com.travelassistant.london.marfo.londontravelassistant.BuildConfig;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.ArrivalResponse;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.RouteSequence;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.AirQuality;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by martafoderaro on 01/05/2017.
 */

public interface TFLServerApi {
    @GET(BuildConfig.TFL_LINE_URL)
    Call<RouteSequence> getStatusLondonBuses(@Path("id") String id, @Path("direction") String direction, @Query(value = "serviceType", encoded = true) String serviceType, @Query(value = "excludeCrowding", encoded = true) boolean excludeCrowding, @Query("app_id") String app_id, @Query("app_key") String app_key);
    @GET(BuildConfig.TFL_ARRIVAL)
    Call<List<ArrivalResponse>> getBusArrivalTimes(@Path("ids") String ids, @Query("stopPointId") String stopPointId, @Query("app_id") String app_id, @Query("app_key") String app_key);
    @GET(BuildConfig.TFL_AIR_QUALITY)
    Call<AirQuality> getAirQualityStatus(@Query("app_id") String app_id, @Query("app_key") String app_key);
}
