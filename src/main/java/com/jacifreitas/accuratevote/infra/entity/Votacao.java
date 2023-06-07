package com.jacifreitas.accuratevote.infra.entity;



import javax.persistence.*;
import java.util.List;
@Entity
public class Votacao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Enquete enquete;
    @OneToMany(mappedBy = "votacao")
    private List<Voto> votos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enquete getEnquete() {
        return enquete;
    }

    public void setEnquete(Enquete enquete) {
        this.enquete = enquete;
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }
}
