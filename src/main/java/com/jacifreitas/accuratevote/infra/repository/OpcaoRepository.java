package com.jacifreitas.accuratevote.infra.repository;

import com.jacifreitas.accuratevote.infra.entity.Opcao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpcaoRepository extends JpaRepository<Opcao, Long> {
}
