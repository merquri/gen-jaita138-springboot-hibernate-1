package com.example.cliente.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cliente.db.entity.Utente;
import com.example.cliente.db.repository.UtenteRepo;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepo utenteRepo;

    public List<Utente> findAll() {
        return utenteRepo.findAll();
    }

    public void save(Utente utente) {
        utenteRepo.save(utente);
    }

public void delete(Utente utente) {
    utenteRepo.delete(utente);
}

public Utente findById(Long id) {

    return utenteRepo.findById(id).orElse(null);
}

public List<Utente> findByNomeStartingWith(String nome) {
    return utenteRepo.findByNomeStartingWith(nome);
}

public List<Utente> findByCreditoGreatherThan(int credito) {
    return utenteRepo.findByCreditoGreatherThan(credito);
}

public List<Utente> findByNomeNullOrCognomeNull() {
    return utenteRepo.findByNomeNullOrCognomeNull();
}

public List<Utente> findByCreditoBetween(int min, int max) {
    return utenteRepo.findByCreditoBetween(min, max);
}

}
