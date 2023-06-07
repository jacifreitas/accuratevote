package com.jacifreitas.accuratevote.infra.repository;

import com.jacifreitas.accuratevote.infra.entity.Enquete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnqueteRepository extends JpaRepository <Enquete, Long>{
}
