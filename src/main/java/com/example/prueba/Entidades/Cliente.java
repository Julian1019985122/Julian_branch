package com.example.prueba.Entidades;

import java.time.LocalDate;

public class Cliente {

    private int id;
    private String nombre;
    private String Barrio;
    private int Casa;
    private int Celular;

    public Cliente(int id, String nombre, String barrio, int casa, int celular) {
        this.id = id;
        this.nombre = nombre;
        Barrio = barrio;
        Casa = casa;
        Celular = celular;
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

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public int getCasa() {
        return Casa;
    }

    public void setCasa(int casa) {
        Casa = casa;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }
}
