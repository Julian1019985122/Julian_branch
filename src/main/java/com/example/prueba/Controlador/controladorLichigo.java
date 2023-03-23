package com.example.prueba.Controlador;

import com.example.*;
import com.example.prueba.Entidades.Lichigo;
import com.example.prueba.Servicios.servicioLichigo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class controladorLichigo {

    servicioLichigo servicio= new servicioLichigo();


    @GetMapping("/listarProductos")
    public ArrayList<Lichigo> listar(){
        return servicio.mostrar();
    }


    @GetMapping("/tamaño")
    public int mostrarCantidad(){
        return servicio.cantidad();
    }


    @GetMapping("/Actualizartotal")
    public ArrayList<Lichigo> actualizartotal(){
        return servicio.actualizartotal();
    }

    @GetMapping("/total")
    public ArrayList<Lichigo> total() {return servicio.total();}




}


