package hn.project.bankabc.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="direcciones")
public class Direccion {

    @Id
    @Column(name="iddireccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDireccion;

    private String departamento;

    private String ciudad;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "dni")
    private Cliente cliente;
}
