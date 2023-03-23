package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Cliente;
import com.example.prueba.Servicios.servicioCliente;
import org.springframework.web.bind.annotation.*;
import com.example.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class controladorCliente {

    servicioCliente servicio=new servicioCliente();


    @GetMapping("/Listarusuario")
    public ArrayList<Cliente> listar(){
        return servicio.listar();
    }

    @PostMapping("/agregarusuario")
    public String agregar(@RequestBody Cliente cliente) {return  servicio.agregarUsuario(cliente);}

    @GetMapping("buscarUsuario/{cod}")
    public Cliente buscarCliente(@PathVariable("cod") int codigo){
        return servicio.buscarUsuario(codigo);
    }

}
