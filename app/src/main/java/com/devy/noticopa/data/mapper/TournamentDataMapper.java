package com.devy.noticopa.data.mapper;

import com.devy.noticopa.data.model.entity.GameEntity;
import com.devy.noticopa.data.model.entity.TournamentEntity;
import com.devy.noticopa.domain.model.Tournament;

import java.util.ArrayList;

/**
 * Created by RONALD on 25/06/2016.
 */
public class TournamentDataMapper {
    public Tournament transform(TournamentEntity tournamentEntity) {
        Tournament tournament = new Tournament();
        if (tournamentEntity == null) return tournament;
        tournament.setId(tournamentEntity.getId());
        tournament.setNombre(tournamentEntity.getName() != null ? tournamentEntity.getName() : "");
        tournament.setEstado(tournamentEntity.getStatus() != null ? tournamentEntity.getStatus() : "");
        tournament.setPartidos(tournamentEntity.getGames() != null ? tournamentEntity.getGames() : new ArrayList<GameEntity>());
        return tournament;
    }


}
