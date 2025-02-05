package com.example.cliente.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cliente.db.entity.SubReddit;
import com.example.cliente.db.repository.SubRedditRepo;

@Service
public class SubRedditService {

    @Autowired
    private SubRedditRepo subredditRepo;

    public List<SubReddit> findAll() {
        return subredditRepo.findAll();
    }

    public void save(SubReddit subReddit) {
        subredditRepo.save(subReddit);
    }

    public SubReddit findById(Long id) {

        return subredditRepo.findById(id).orElse(null);
    }
}
