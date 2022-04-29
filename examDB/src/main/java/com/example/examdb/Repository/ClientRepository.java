package com.example.examdb.Repository;

import model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    public Client findClientByName(String name);
}
