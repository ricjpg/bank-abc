package hn.project.bankabc.Services.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.project.bankabc.Models.Cliente;
import hn.project.bankabc.Repositories.ClienteRepository;
import hn.project.bankabc.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente nuevoCliente) {

        return clienteRepository.save(nuevoCliente);
    }

    @Override
    public List<Cliente> getAll(){
        return this.clienteRepository.findAll();
    }

    @Override
    public String eliminarClienteId(String dniCliente) {
        Cliente clienteEliminar = this.clienteRepository.findById(dniCliente).get();
        if(clienteEliminar != null){
            this.clienteRepository.delete(clienteEliminar);
            return "Se ha elimnado el cliente con dni: " + clienteEliminar.getDni();
        }
        return "No existe el cliente con dni: " + dniCliente;
    }
}