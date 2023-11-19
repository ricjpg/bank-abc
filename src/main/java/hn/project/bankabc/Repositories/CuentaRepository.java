package hn.project.bankabc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.project.bankabc.Models.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
    
}
