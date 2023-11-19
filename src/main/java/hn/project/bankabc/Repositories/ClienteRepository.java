package hn.project.bankabc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.project.bankabc.Models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    
    
}
