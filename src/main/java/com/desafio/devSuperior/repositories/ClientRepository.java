package com.desafio.devSuperior.repositories;

import com.desafio.devSuperior.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
