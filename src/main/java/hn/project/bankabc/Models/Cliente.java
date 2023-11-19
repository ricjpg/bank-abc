package hn.project.bankabc.Models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="clientes")
public class Cliente {
    
    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;
    
    private String telefono;

    @Column(name="fechaingreso")
    private Date fechaIngreso;


    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Direccion direccion;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cuenta> cuentas = new ArrayList<>();

}
