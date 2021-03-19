package com.tutorial.crud.service;

import com.tutorial.crud.entity.Ciudad;
import com.tutorial.crud.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CiudadService {

    @Autowired
    CiudadRepository ciudadRepository;

    public List<Ciudad> list(){
        return ciudadRepository.findAll();
    }

}
