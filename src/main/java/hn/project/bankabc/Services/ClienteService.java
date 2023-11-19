package hn.project.bankabc.Services;

import java.util.List;

import hn.project.bankabc.Models.Cliente;

public interface ClienteService {
 
    public Cliente crearCliente(Cliente nuevoCliente);

    public List<Cliente> getAll();

    public String eliminarClienteId(String dniCliente);

}
