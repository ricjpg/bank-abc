package hn.project.bankabc.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.project.bankabc.Models.Cliente;
import hn.project.bankabc.Services.Implementation.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;


    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nuevoCliente){
        if(nuevoCliente.getDireccion() != null)   {
            nuevoCliente.getDireccion().setCliente(nuevoCliente);
        }
        return this.clienteServiceImpl.crearCliente(nuevoCliente);
    }

    @GetMapping("/todos")
    public List<Cliente> getAll(){
        return this.clienteServiceImpl.getAll();
    }
    @DeleteMapping("/eliminar")
    public String eliminarClienteId(@RequestParam(name="dni") String dni){
        return this.clienteServiceImpl.eliminarClienteId(dni);
    }
}
