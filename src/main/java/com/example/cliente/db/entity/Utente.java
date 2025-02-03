package com.example.cliente.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String nome;
    @Column(length = 64)
    private String cognome;
    @Column(length = 64)
    private String password;
    @Column(length = 128)
    private String username;

    private int credito; // il valore deve essere espresso in centesimi di euro)

    @ManyToOne
    private Role role;

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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Utente [\n" 
        + " id="+ id + ",\n"
        + " nome="+ nome + ",\n"
        + " cognome="+ cognome + ",\n"
        + " username="+ username + ",\n"
        + " password="+ password + ",\n"
        + " credito="+ credito + ",\n"
        + "]";
    }

}
