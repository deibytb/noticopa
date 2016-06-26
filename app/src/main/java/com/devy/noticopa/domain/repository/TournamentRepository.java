package com.devy.noticopa.domain.repository;

import com.devy.noticopa.domain.interactor.TournamentCallback;

/**
 * Created by RONALD on 25/06/2016.
 */
public interface TournamentRepository {
    void loadTorunaments(final TournamentCallback tournamentCallback);
}
