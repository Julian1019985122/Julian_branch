package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioCliente {

    ArrayList<Cliente> lista=new ArrayList<>();

    public servicioCliente()
    {
        lista.add(new Cliente(10,"Luisa", "Sosiego",5014,156165));
        lista.add(new Cliente(11,"Julian", "San Carlos", 3021,245654));
        lista.add(new Cliente(12,"Julio", "San jose", 2020,3116161));
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
