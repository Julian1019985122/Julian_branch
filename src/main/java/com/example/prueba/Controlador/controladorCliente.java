package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Cliente;
import com.example.prueba.Entidades.Lichigo;
import com.example.prueba.Servicios.servicioCliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class controladorCliente {

    servicioCliente servicio=new servicioCliente();


    @GetMapping("/Listarcliente")
    public ArrayList<Cliente> listar(){
        return servicio.listar();
    }

    @PostMapping("/agregarCliente")
    public String agregar(@RequestBody Cliente cliente) {return  servicio.agregarCliente(cliente);}

    @GetMapping("buscarcliente/{cod}")
    public Cliente buscarCliente(@PathVariable("cod") int codigo){
        return servicio.buscarCliente(  codigo);
    }

}
