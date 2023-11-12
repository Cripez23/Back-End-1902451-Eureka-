package com.celulares.celulares.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.celulares.celulares.entity.Celular;
import com.celulares.celulares.service.CelularService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CelularController {

    @Autowired
    private CelularService service;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/list")
    public List<Celular> List() {
        return service.findAll().stream().map(cel -> {
            cel.setPort(port);
            return cel;
        }).collect(Collectors.toList());

    }

    @GetMapping("/celular/{id}")
    public Celular detail(@PathVariable Long id) {

        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return service.findById(id);
    }

    @DeleteMapping("/celular/{id}")
    public ResponseEntity<Void> drop(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/celular")
    public ResponseEntity<Celular> add(@RequestBody Celular instance) {
        Celular cel = service.save(instance);
        return new ResponseEntity<>(cel, HttpStatus.CREATED);
    }

    @PutMapping("/celular/{id}")
    public ResponseEntity<Celular> update(@PathVariable Long id, @RequestBody Celular instance) {
        if (service.existsById(id)) {
            instance.setId(id);
            Celular cel = service.save(instance);
            return new ResponseEntity<>(cel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
