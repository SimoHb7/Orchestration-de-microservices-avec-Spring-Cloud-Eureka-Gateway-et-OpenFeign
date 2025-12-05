package com.example.serviceclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.serviceclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {}