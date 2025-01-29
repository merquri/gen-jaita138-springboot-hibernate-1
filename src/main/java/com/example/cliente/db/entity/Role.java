package com.example.cliente.db.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome, descrizone;

    /* @OneToMany(mappedBy = "role")
    private List<Utente> utenti; */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizone() {
        return descrizone;
    }

    public void setDescrizone(String descrizone) {
        this.descrizone = descrizone;
    }

    @Override
    public String toString() {
        return "Role [\n"
                + " id=" + id + ",\n"
                + " nome=" + nome + ",\n"
                + " descrizione=" + descrizone + ",\n"
                + "]";
    }

}
