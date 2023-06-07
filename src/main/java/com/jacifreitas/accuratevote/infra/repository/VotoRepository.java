package com.jacifreitas.accuratevote.infra.repository;

import com.jacifreitas.accuratevote.infra.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, Long> {
}
