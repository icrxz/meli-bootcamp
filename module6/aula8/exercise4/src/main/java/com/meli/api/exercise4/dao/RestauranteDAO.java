package com.meli.api.exercise4.dao;

import com.meli.api.exercise4.entity.Mesa;
import com.meli.api.exercise4.entity.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {
    private static Restaurante restaurante = new Restaurante();

    public Restaurante getRestaurante() {
        return restaurante;
    }
}
