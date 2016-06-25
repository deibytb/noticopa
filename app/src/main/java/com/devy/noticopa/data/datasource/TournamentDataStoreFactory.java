package com.devy.noticopa.data.datasource;

import android.content.Context;

import com.devy.noticopa.data.datasource.rest.interfaces.TournamentDataStore;

/**
 * Created by RONALD on 25/06/2016.
 */
public class TournamentDataStoreFactory {
    public static final int DB = 1;
    public static final int CLOUD = 2;
    public static final int PREFERENCES = 3;

    private final Context context;

    public TournamentDataStoreFactory(Context context) {

        if (context == null) {
            throw new IllegalArgumentException("Constructor sin parametros");
        }
        this.context = context.getApplicationContext();
    }

    public TournamentDataStore create(int dataSource) {
        TournamentDataStore tournamentDataStore = null;

        switch (dataSource) {
            case CLOUD:
                tournamentDataStore = createCloudDataStore();
                break;
            case DB:
//                tournamentDataStore= new DbPlaceDataStore();
                break;
            case PREFERENCES:
//                tournamentDataStore= new PreferencesPlaceDataStore(context);
                break;
        }
        return tournamentDataStore;
    }


    public TournamentDataStore createCloudDataStore() {
        // Todo if create database
        return null;
    }
}
