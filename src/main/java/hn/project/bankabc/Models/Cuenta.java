package hn.project.bankabc.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(name="montominimo")
    private double montoMinimo;

    private double saldo;

    @Column(name="fechaapertura")
    private Date fechaApertura;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

    @OneToMany(mappedBy="cuenta", cascade = CascadeType.ALL)
    private List<Movimiento> movimientos = new ArrayList<>();
}
