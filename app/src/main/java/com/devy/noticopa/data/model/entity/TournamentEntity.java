package com.devy.noticopa.data.model.entity;

import java.util.List;

/**
 * Created by RONALD on 25/06/2016.
 */
public class TournamentEntity {
    /*id: int,
    name: string,
    status: string,
    games: list
    */
    private int id;
    private String name;
    private String status;
    private List<GameEntity> games;

    public TournamentEntity(int id, String name, String status, List<GameEntity> games) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.games = games;
    }

    public TournamentEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GameEntity> getGames() {
        return games;
    }

    public void setGames(List<GameEntity> games) {
        this.games = games;
    }
}
