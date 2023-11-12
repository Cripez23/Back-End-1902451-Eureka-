package com.microservice.store.models;

import java.util.Date;

public class Celular {
    private Long id;

    private String name;

    private String marca;

    private Date createdAt;

    private Integer port;

    public Celular(Long id, String name, String Marca) {
        this.id = id;
        this.name = name;
        this.marca = marca;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}
