package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Integer> {
    Optional<Direccion> findByCiudad(String ciudad);
    boolean existsByCiudad(String ciudad);
}
