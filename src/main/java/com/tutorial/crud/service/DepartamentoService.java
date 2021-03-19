package com.tutorial.crud.service;

import com.tutorial.crud.entity.Departamento;
import com.tutorial.crud.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public List<Departamento> list(){
        return departamentoRepository.findAll();
    }

}
