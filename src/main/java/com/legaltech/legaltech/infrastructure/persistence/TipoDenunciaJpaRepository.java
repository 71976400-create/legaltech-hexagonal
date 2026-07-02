package com.legaltech.legaltech.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDenunciaJpaRepository extends JpaRepository<TipoDenunciaEntity, Long> {

}