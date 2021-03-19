package com.tutorial.crud.controller;

import com.tutorial.crud.dto.DireccionDto;
import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.entity.Direccion;
import com.tutorial.crud.service.DireccionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direccion")
@CrossOrigin(origins = "http://localhost:4200")
public class DireccionController {

    @Autowired
    DireccionService direccionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Direccion>> list(){
        List<Direccion> list = direccionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Direccion> getById(@PathVariable("id") int id){
        if(!direccionService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Direccion producto = direccionService.getOne(id).get();
        return new ResponseEntity(producto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DireccionDto direccionDto){
        if(direccionDto.getNumerocalle()<0 )
            return new ResponseEntity(new Mensaje("El numero de calle debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(direccionDto.getNombrecalle()))
            return new ResponseEntity(new Mensaje("El nombre de la calle es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(direccionDto.getCiudad()))
            return new ResponseEntity(new Mensaje("La ciudad es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(direccionDto.getDepartamento()))
            return new ResponseEntity(new Mensaje("El departamento es obligatorio"), HttpStatus.BAD_REQUEST);
        if(direccionDto.getCodpostal()<0 )
            return new ResponseEntity(new Mensaje("El codigo postal debe ser mayor a 0"), HttpStatus.BAD_REQUEST);

        Direccion direccion = new Direccion(direccionDto.getNumerocalle(), direccionDto.getNombrecalle(), direccionDto.getCiudad(), direccionDto.getDepartamento(), direccionDto.getCodpostal(), direccionDto.getTipodireccion());
        direccionService.save(direccion);
        return new ResponseEntity(new Mensaje("Direccion creada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody DireccionDto direccionDto){
        if(!direccionService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(direccionDto.getNumerocalle()<0 )
            return new ResponseEntity(new Mensaje("El numero de calle debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(direccionDto.getNombrecalle()))
            return new ResponseEntity(new Mensaje("El nombre de la calle es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(direccionDto.getCiudad()))
            return new ResponseEntity(new Mensaje("La ciudad es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(direccionDto.getDepartamento()))
            return new ResponseEntity(new Mensaje("El departamento es obligatorio"), HttpStatus.BAD_REQUEST);
        if(direccionDto.getCodpostal()<0 )
            return new ResponseEntity(new Mensaje("El codigo postal debe ser mayor a 0"), HttpStatus.BAD_REQUEST);

        Direccion direccion = direccionService.getOne(id).get();
        direccion.setNumerocalle(direccionDto.getNumerocalle());
        direccion.setNombrecalle(direccionDto.getNombrecalle());
        direccion.setCiudad(direccionDto.getCiudad());
        direccion.setDepartamento(direccionDto.getDepartamento());
        direccion.setCodpostal(direccionDto.getCodpostal());
        direccionService.save(direccion);
        return new ResponseEntity(new Mensaje("Direccion actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!direccionService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        direccionService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
}
