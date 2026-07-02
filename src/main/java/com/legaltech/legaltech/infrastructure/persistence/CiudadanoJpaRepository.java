package com.legaltech.legaltech.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadanoJpaRepository
        extends JpaRepository<CiudadanoEntity, Integer> {
}