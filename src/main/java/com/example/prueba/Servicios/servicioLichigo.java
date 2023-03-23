package com.example.prueba.Servicios;

import java.util.ArrayList;

public class servicioLichigo {

    private ArrayList<com.example.prueba.Entidades.Lichigo> lista = new ArrayList<>();

    public servicioLichigo() {
        lista.add(new com.example.prueba.Entidades.Lichigo(1, "Manzana", 5800.0, 50, 0, "Frutas"));
        lista.add(new com.example.prueba.Entidades.Lichigo(1, "Papa", 2500.0, 120, 0, "Vegetales"));
        lista.add(new com.example.prueba.Entidades.Lichigo(1, "Fresa", 4500.0, 250, 0, "Frutas"));
        lista.add(new com.example.prueba.Entidades.Lichigo(1, "Jabon de baño", 9800.0, 330, 0, "Aseo"));
        lista.add(new com.example.prueba.Entidades.Lichigo(1, "Frijol", 15800.0, 50, 0, "Grano"));

    }


    public ArrayList<com.example.prueba.Entidades.Lichigo> mostrar() {
        return lista;
    }

    public int cantidad() {
        return lista.size();
    }

    public ArrayList<com.example.prueba.Entidades.Lichigo> actualizartotal() {
        for (com.example.prueba.Entidades.Lichigo productos : lista) {
            productos.setTotal(productos.getCantidad() * productos.getPrecio());
        }
        return lista;


    }


    public ArrayList<com.example.prueba.Entidades.Lichigo> total(){
        for(com.example.prueba.Entidades.Lichigo productos:lista){
            productos.setTotal(+productos.getTotal());
        }
        return lista;
    }







}

















