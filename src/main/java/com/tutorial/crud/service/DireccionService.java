package com.tutorial.crud.service;

import com.tutorial.crud.entity.Direccion;
import com.tutorial.crud.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DireccionService {

    @Autowired
    DireccionRepository direccionRepository;

    public List<Direccion> list(){
        return direccionRepository.findAll();
    }

    public Optional<Direccion> getOne(int id){
        return direccionRepository.findById(id);
    }

    public Optional<Direccion> getByCiudad(String ciudad){
        return direccionRepository.findByCiudad(ciudad);
    }

    public void  save(Direccion direccion){
        direccionRepository.save(direccion);
    }

    public void delete(int id){
        direccionRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return direccionRepository.existsById(id);
    }

    public boolean existsByCiudad(String ciudad){
        return direccionRepository.existsByCiudad(ciudad);
    }
}
