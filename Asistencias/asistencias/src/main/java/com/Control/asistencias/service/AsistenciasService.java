package com.Control.asistencias.service;

import com.Control.asistencias.entity.Asistencias;

import java.util.List;

public interface AsistenciasService {
    public List<Asistencias> findAll();
    public List<Asistencias> findByNombre(String nombre);
    public void createAsistencias(Asistencias asistencias);
    public void modifyAsistencias(Long id, Asistencias asistencias);
    public void deleteAsistencias(Long id);
    public Asistencias findById(Long id);
}
