package com.Control.asistencias.service;

import com.Control.asistencias.dao.AsistenciasDao;
import com.Control.asistencias.entity.Asistencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciasServiceImpl implements AsistenciasService{
    @Autowired
    private AsistenciasDao asistenciasDao;
    @Override
    public List<Asistencias> findAll() {
        return (List<Asistencias>) asistenciasDao.findAll();
    }

    @Override
    public List<Asistencias> findByNombre(String nombre) {
        return asistenciasDao.findByNombre(nombre);
    }

    @Override
    public void createAsistencias(Asistencias asistencias) {
        asistenciasDao.save(asistencias);

    }

    @Override
    public void modifyAsistencias(Long id, Asistencias asistencias) {
        if (asistenciasDao.existsById(id)){
            asistencias.setId(id);
            asistenciasDao.save(asistencias);
        }
    }

    @Override
    public void deleteAsistencias(Long id) {
        if (asistenciasDao.existsById(id)){
            asistenciasDao.deleteById(id);
        }

    }

    @Override
    public Asistencias findById(Long id) {
        return asistenciasDao.findById(id).orElse(null);
    }
}
