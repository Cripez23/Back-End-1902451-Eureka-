package com.microservice.store.models;

public class Store {
    private Celular cel;
    private Integer cantidad;

    public Store() {

    }

    public Store(Celular cel, Integer cantidad) {
        super();
        this.cel = cel;
        this.cantidad = cantidad;
    }

    public Celular getCel() {
        return this.cel;
    }

    public void setCel(Celular cel) {
        this.cel = cel;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}
