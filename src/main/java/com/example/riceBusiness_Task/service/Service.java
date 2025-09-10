package com.example.riceBusiness_Task.service;

import com.example.riceBusiness_Task.entity.Entity;
import com.example.riceBusiness_Task.repository.Repository;

import java.time.LocalDate;
import java.util.List;


@org.springframework.stereotype.Service
public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public Entity save(Entity details)
    {
        return repository.save(details);
    }

    public List<Entity> getAllDetails()
    {
        return repository.findAll();
    }

    public List<Entity> getByDate(LocalDate date)
    {
        return repository.findByLocalDate(date);
    }

    public List<Entity> getByType(String type)
    {
        return repository.findByType(type);

    }
}













