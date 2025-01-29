package com.example.cliente.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cliente.db.entity.Role;
import com.example.cliente.db.repository.RoleRepo;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    public void save(Role role) {
        roleRepo.save(role);
    }

    public Role findById(Long id) {

        return roleRepo.findById(id).orElse(null);
    }
}
