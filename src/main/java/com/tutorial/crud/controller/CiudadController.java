package com.tutorial.crud.controller;

import com.tutorial.crud.entity.Ciudad;
import com.tutorial.crud.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudad")
@CrossOrigin(origins = "http://localhost:4200")
public class CiudadController {

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/lista")
    public ResponseEntity<List<Ciudad>> list(){
        List<Ciudad> list = ciudadService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
