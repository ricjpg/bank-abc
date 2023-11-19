package hn.project.bankabc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.project.bankabc.Models.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {
    
}
