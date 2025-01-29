package com.example.cliente.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cliente.db.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
