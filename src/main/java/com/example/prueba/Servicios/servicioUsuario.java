package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuario {

    ArrayList<Usuario> lista=new ArrayList<>();

    public servicioUsuario()
    {
        lista.add(new Usuario(10,"Luisa", "Alemania", LocalDate.of(2023,2,28),"luisa@gmil.com"));
        lista.add(new Usuario(11,"Julian", "Colombia", LocalDate.of(2022,3,10),"julian@gmil.com"));
        lista.add(new Usuario(12,"Julio", "Peru", LocalDate.of(2020,4,7),"julio@gmil.com"));
    }

    public ArrayList<Usuario> listar(){
        return lista;
    }

    public String agregarUsuario(Usuario usu){
        lista.add(usu);
        return "Registro extoso";
    }

    public Usuario buscarUsuario(int codigo){
     Usuario usu=null;
     for(Usuario u: lista){
         if (u.getId() == codigo){
             usu=u;
         }
     }

     return usu;
    }

}
