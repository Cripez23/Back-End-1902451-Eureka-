package com.celulares.celulares.service;

import java.util.List;

import com.celulares.celulares.entity.Celular;

public interface CelularService {

    public List<Celular> findAll();

    public Celular findById(Long id);

    public void deleteById(Long id);

    public Celular save(Celular instace);

    public boolean existsById(Long id);
}
