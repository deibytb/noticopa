package com.devy.noticopa.data.datasource.rest;

import android.util.Log;

import com.devy.noticopa.data.datasource.rest.interfaces.ServiceApiInterface;
import com.devy.noticopa.data.datasource.rest.interfaces.TournamentDataStore;
import com.devy.noticopa.data.model.response.TournamentResponse;
import com.devy.noticopa.domain.repository.RepositoryCallback;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by RONALD on 25/06/2016.
 */
public class RestTournamentDataStore implements TournamentDataStore{
    private ServiceApiInterface servicesApiInterface;
    private static final String TAG = RestTournamentDataStore.class.getSimpleName();

    public RestTournamentDataStore() {
        this.servicesApiInterface = RetrofitApiClient.getMyApiClient();
    }

    @Override
    public void loadTournament(final RepositoryCallback repositoryCallback) {
        servicesApiInterface.tournaments(new Callback<TournamentResponse>() {
            @Override
            public void success(TournamentResponse tournamentResponse, Response response) {
                if (tournamentResponse != null){
                    repositoryCallback.onSuccess(tournamentResponse);
                } else {
                    repositoryCallback.onError("");
                }
            }

            @Override
            public void failure(RetrofitError error) {
                String message="";
                if(error!=null) {
                    message= error.getMessage();
                }
                Log.v(TAG,"error "+message);
                repositoryCallback.onError(message);
            }
        });
    }
}
