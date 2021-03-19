package com.tutorial.crud.controller;

import com.tutorial.crud.entity.Departamento;
import com.tutorial.crud.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@CrossOrigin(origins = "http://localhost:4200")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/lista")
    public ResponseEntity<List<Departamento>> list(){
        List<Departamento> list = departamentoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
