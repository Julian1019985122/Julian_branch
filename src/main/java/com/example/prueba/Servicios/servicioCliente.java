package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioCliente {

    ArrayList<Cliente> lista=new ArrayList<>();

    public servicioCliente()
    {
        lista.add(new Cliente(10,"Luisa", "Alemania", LocalDate.of(2023,2,28),"luisa@gmil.com"));
        lista.add(new Cliente(11,"Julian", "Colombia", LocalDate.of(2022,3,10),"julian@gmil.com"));
        lista.add(new Cliente(12,"Julio", "Peru", LocalDate.of(2020,4,7),"julio@gmil.com"));
    }

    public ArrayList<Cliente> listar(){
        return lista;
    }

    public String agregarUsuario(Cliente usu){
        lista.add(usu);
        return "Registro extoso";
    }

    public Cliente buscarUsuario(int codigo){
     Cliente usu=null;
     for(Cliente u: lista){
         if (u.getId() == codigo){
             usu=u;
         }
     }

     return usu;
    }

}
