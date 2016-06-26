package com.devy.noticopa.domain.interactor;

import com.devy.noticopa.domain.repository.TournamentRepository;

/**
 * Created by RONALD on 25/06/2016.
 */
public class TournamentInteractor {
    private final TournamentRepository tournamentRepository;

    public TournamentInteractor(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    public void loadPlaces( final TournamentCallback tournamentCallback)
    {
        tournamentRepository.loadTorunaments(tournamentCallback);
    }
}
