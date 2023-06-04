package com.Control.asistencias.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "asistencias")
public class Asistencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nombre;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    public Date fecha;
    public String telefono;
    public String departamento_de_trabajo;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento_de_trabajo() {
        return departamento_de_trabajo;
    }

    public void setDepartamento_de_trabajo(String departamento_de_trabajo) {
        this.departamento_de_trabajo = departamento_de_trabajo;
    }
}
