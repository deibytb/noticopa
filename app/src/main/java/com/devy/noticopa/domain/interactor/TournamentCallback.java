package com.devy.noticopa.domain.interactor;

import com.devy.noticopa.domain.model.Tournament;

import java.util.List;

/**
 * Created by RONALD on 25/06/2016.
 */
public interface TournamentCallback {
    void onTournamentSuccess(List<Tournament> tournaments);

    void onTournamentError(String message);
}
