package com.jacifreitas.accuratevote.infra.entity;

import com.jacifreitas.accuratevote.infra.entity.Opcao;
import com.jacifreitas.accuratevote.infra.entity.Votacao;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Voto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Opcao opcao;
    private LocalDateTime dataHora;
    @ManyToOne
    private Votacao votacao;

    public Votacao getVotacao() {
        return votacao;
    }

    public void setVotacao(Votacao votacao) {
        this.votacao = votacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Opcao getOpcao() {
        return opcao;
    }

    public void setOpcao(Opcao opcao) {
        this.opcao = opcao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
