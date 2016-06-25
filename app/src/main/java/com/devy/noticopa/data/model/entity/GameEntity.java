package com.devy.noticopa.data.model.entity;

/**
 * Created by RONALD on 25/06/2016.
 */
public class GameEntity {
    /*id: int,
    equipo_a: string,
    equipo_b: string,
    goles_a: int,
    goles_b: int,
    status: string*/

    private int id;
    private String equipo_a;
    private String equipo_b;
    private int goles_a;
    private int goles_b;
    private String status;

    public GameEntity(int id, String equipo_a, String equipo_b, int goles_a, int goles_b, String status) {
        this.id = id;
        this.equipo_a = equipo_a;
        this.equipo_b = equipo_b;
        this.goles_a = goles_a;
        this.goles_b = goles_b;
        this.status = status;
    }

    public GameEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo_a() {
        return equipo_a;
    }

    public void setEquipo_a(String equipo_a) {
        this.equipo_a = equipo_a;
    }

    public String getEquipo_b() {
        return equipo_b;
    }

    public void setEquipo_b(String equipo_b) {
        this.equipo_b = equipo_b;
    }

    public int getGoles_a() {
        return goles_a;
    }

    public void setGoles_a(int goles_a) {
        this.goles_a = goles_a;
    }

    public int getGoles_b() {
        return goles_b;
    }

    public void setGoles_b(int goles_b) {
        this.goles_b = goles_b;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
