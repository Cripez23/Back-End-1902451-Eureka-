package com.microservice.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.store.models.Celular;
import com.microservice.store.models.Store;
import com.microservice.store.services.StoreService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/list")
    public List<Store> list() {
        return storeService.findAll();
    }

    @HystrixCommand(fallbackMethod = "metodoGenerico")
    @GetMapping("/celular/{id}/cantidad/{cantidad}")
    public Store details(@PathVariable Long id, @PathVariable Integer cantidad) {
        return storeService.findById(id, cantidad);
    }

    public Store metodoGenerico(Long id, Integer cantidad) {
        Store store = new Store();
        Celular cel = new Celular(id, "El Cel del Profe", "Samsung");
        store.setCantidad(cantidad);
        store.setCel(cel);

        return store;
    }
}
