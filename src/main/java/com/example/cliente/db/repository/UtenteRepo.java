package com.example.cliente.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cliente.db.entity.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Long> {


    List<Utente> findByNomeStartingWith(String nome);
    List<Utente> findByCreditoGreatherThan(int credito);
    List<Utente> findByNomeNullOrCognomeNull();
    List<Utente> findByCreditoBetween(int min, int max);
}
