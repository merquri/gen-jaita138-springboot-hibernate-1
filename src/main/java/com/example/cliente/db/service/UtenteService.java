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

public List<Utente> findByNomeStartingWithA() {
    return utenteRepo.findByNomeStartingWith("a");
}

public List<Utente> findByCreditoGreaterThan10() {
    return utenteRepo.findByCreditoGreaterThan(10*100);
}

public List<Utente> findByNomeNullOrCognomeNull() {
    return utenteRepo.findByNomeNullOrCognomeNull();
}

public List<Utente> findByCreditoBetween0And10() {
    return utenteRepo.findByCreditoBetween(0, 10*100);
}

}
