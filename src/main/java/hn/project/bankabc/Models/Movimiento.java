package hn.project.bankabc.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="movimientos")
public class Movimiento {
    

    @Id
    @Column(name="idmovimiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;


    @Column(name="fechamovimiento")
    private Date fechaMovimiento;

    private double monto;

    @Column(name="tipomovimiento")
    private String tipoMovimiento;


    @ManyToOne
    @JoinColumn(name="idCuenta", referencedColumnName="idCuenta")
    private Cuenta cuenta;
}
