package com.devy.noticopa.data.datasource.rest.interfaces;


import com.devy.noticopa.data.model.response.TournamentResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * Created by RONALD on 25/06/2016.
 */
public interface ServiceApiInterface {
    @Headers({"Content-Type: application/json", "application-type: REST" })
    @GET("Ruta")
    void tournaments( Callback<TournamentResponse> callback);
}
