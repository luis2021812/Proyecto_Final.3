package com.Control.asistencias.dao;

import com.Control.asistencias.entity.Asistencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AsistenciasDao extends CrudRepository<Asistencias, Long>{

    List<Asistencias> findByNombre(String nombre);
}


