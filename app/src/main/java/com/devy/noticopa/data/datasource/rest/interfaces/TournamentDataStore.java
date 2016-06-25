package com.devy.noticopa.data.datasource.rest.interfaces;

import com.devy.noticopa.domain.repository.RepositoryCallback;

/**
 * Created by RONALD on 25/06/2016.
 */
public interface TournamentDataStore {

    void loadTournament(RepositoryCallback repositoryCallback);
}