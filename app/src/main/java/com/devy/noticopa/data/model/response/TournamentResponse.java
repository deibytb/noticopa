package com.devy.noticopa.data.model.response;

import com.devy.noticopa.data.model.entity.TournamentEntity;

import java.util.List;

/**
 * Created by RONALD on 25/06/2016.
 */
public class TournamentResponse {
    private TournamentEntity tournamentEntity;

    public TournamentResponse(TournamentEntity tournamentEntity) {
        this.tournamentEntity = tournamentEntity;
    }

    public TournamentResponse() {
    }

    public TournamentEntity getTournamentEntity() {
        return tournamentEntity;
    }

    public void setTournamentEntity(TournamentEntity tournamentEntity) {
        this.tournamentEntity = tournamentEntity;
    }
}
