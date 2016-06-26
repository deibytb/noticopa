package com.devy.noticopa.data.datasource.rest;

import com.devy.noticopa.data.datasource.rest.interfaces.ServiceApiInterface;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by RONALD on 25/06/2016.
 */
public class RetrofitApiClient {
    private static final String TAG = "ApiClient";
    private static ServiceApiInterface serviceApiInterface;

    public static ServiceApiInterface getMyApiClient() {

        if (serviceApiInterface == null) {

            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://noti-copa.herokuapp.com/api/v1")
                    .setClient(new OkClient(getClient()))

                    .build();

            serviceApiInterface = restAdapter.create(ServiceApiInterface.class);
        }
        return serviceApiInterface;
    }

    public static ServiceApiInterface getServiceApiInterface() {
        return serviceApiInterface;
    }

    private static OkHttpClient getClient() {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(2, TimeUnit.MINUTES);
        client.setReadTimeout(2, TimeUnit.MINUTES);
        return client;
    }
}
