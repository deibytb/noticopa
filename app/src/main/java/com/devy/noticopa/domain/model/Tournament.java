package com.devy.noticopa.domain.model;

import com.devy.noticopa.data.model.entity.GameEntity;

import java.util.List;

/**
 * Created by RONALD on 25/06/2016.
 */
public class Tournament {
    private int id;
    private String nombre;
    private String estado;
    private List<GameEntity> partidos;

    public Tournament(int id, String nombre, String estado, List<GameEntity> partidos) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.partidos = partidos;
    }

    public Tournament() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<GameEntity> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<GameEntity> partidos) {
        this.partidos = partidos;
    }
}
