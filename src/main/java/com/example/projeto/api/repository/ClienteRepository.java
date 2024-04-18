package com.example.projeto.api.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.projeto.api.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
    public Cliente findByEmail(String email);
    public Cliente findById(int id);
}
