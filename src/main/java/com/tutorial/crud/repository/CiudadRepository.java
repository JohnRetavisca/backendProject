package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
    Optional<Ciudad> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
