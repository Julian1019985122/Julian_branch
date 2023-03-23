package com.example.prueba.Controlador;


import com.example.prueba.Entidades.Productos;
import com.example.prueba.Servicios.servicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class controladorProductos{

    servicioProductos servicio= new servicioProductos();


    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }


    @GetMapping("/tamaño")
    public int mostrarCantidad(){
        return servicio.cantidad();
    }


    @GetMapping("/Actualizartotal")
    public ArrayList<Productos> actualizartotal(){
        return servicio.actualizartotal();
    }

    @GetMapping("/total")
    public ArrayList<Productos> total() {return servicio.total();}




}


