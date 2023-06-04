package com.Control.asistencias.controller;

import com.Control.asistencias.entity.Asistencias;
import com.Control.asistencias.service.AsistenciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/asistencias")
//@CrossOrigin(origins = "colocar URL interfaz)

public class AsistenciasController {

    @Autowired
    AsistenciasService asistenciasService;
    @GetMapping
    public List<Asistencias> mostrarAsistencias() {
        return asistenciasService.findAll();
    }
    @GetMapping(value ="/{id}")
    public Asistencias findById(@RequestParam Long id) {
        return asistenciasService.findById(id);
    }
    @GetMapping(value = "/{nombre}")
    public  List<Asistencias> findByName(@RequestParam String nombre){
        return asistenciasService.findByNombre(nombre);
    }
    @PostMapping()
    public void crearasistencias(@RequestBody Asistencias asistencias){
        asistenciasService.createAsistencias(asistencias);
    }
    @PutMapping(value = "/{id}")
    public void modificarasistencias(@RequestParam Long id, @RequestBody Asistencias asistencias){
        asistenciasService.modifyAsistencias(id, asistencias);
    }
    @DeleteMapping(value = "/{id}")
    public void eliminarasistencias(@PathVariable Long id) {
        asistenciasService.deleteAsistencias(id);}
}
