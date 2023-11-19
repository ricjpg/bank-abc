package hn.project.bankabc.Models;

import java.util.Date;
import java.util.LinkedList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cuentas")
@Data
public class Cuenta {
    
    @Id
    @Column(name="idcuenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;

    @Column(name="tipocuenta")
    private String tipoCuenta;

    @Column(name="montoMinimo")
    private double montoMinimo;

    private double saldo;

    @Column(name="fechaapertura")
    private Date fechaApertura;
    
    private String dni;

    // @ManyToOne
    // @JoinColumn(name="dni", referencedColumnName = "dni")
    // private Cliente cliente;

    // @OneToMany(mappedBy = "idCuenta", cascade = CascadeType.ALL)
    // private LinkedList<Movimiento> movimiento = new LinkedList<Movimiento>();

}
