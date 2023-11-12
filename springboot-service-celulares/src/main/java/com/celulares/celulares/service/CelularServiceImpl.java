package com.celulares.celulares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celulares.celulares.entity.Celular;
import com.celulares.celulares.repository.CelularDao;

@Service
public class CelularServiceImpl implements CelularService {

    @Autowired
    private CelularDao celularDao;

    @Override
    public List<Celular> findAll() {
        return (List<Celular>) celularDao.findAll();
    }

    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        celularDao.deleteById(id);
    }

    @Override
    public Celular save(Celular instace) {
        return celularDao.save(instace);
    }

    @Override
    public boolean existsById(Long id) {
        return celularDao.existsById(id);
    }

}
