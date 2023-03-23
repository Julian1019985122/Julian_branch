package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Usuario;
import com.example.prueba.Servicios.servicioUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class controladorUsuario {

    servicioUsuario servicio=new servicioUsuario();


    @GetMapping("/Listarusuario")
    public ArrayList<Usuario> listar(){
        return servicio.listar();
    }

    @PostMapping("/agregarusuario")
    public String agregar(@RequestBody Usuario usuario) {return  servicio.agregarUsuario(usuario);}

    @GetMapping("buscarUsuario/{cod}")
    public Usuario buscarUsuario(@PathVariable("cod") int codigo){
        return servicio.buscarUsuario(codigo);
    }

}
