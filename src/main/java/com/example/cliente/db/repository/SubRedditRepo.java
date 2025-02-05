package com.example.cliente.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cliente.db.entity.SubReddit;

@Repository
public interface SubRedditRepo extends JpaRepository<SubReddit, Long> {

}
