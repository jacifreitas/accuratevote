package com.jacifreitas.accuratevote.infra.repository;

import com.jacifreitas.accuratevote.infra.entity.Votacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotacaoRepository extends JpaRepository<Votacao, Long> {
}
