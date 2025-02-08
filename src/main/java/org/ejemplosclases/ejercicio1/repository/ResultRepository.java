package org.ejemplosclases.ejercicio1.repository;

import org.ejemplosclases.ejercicio1.model.DiceResult;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResultRepository {
    // Clase que simula un repositorio de resultados de lanzamientos de dados
    private final List<DiceResult> results = new ArrayList<>();

    public void save(DiceResult result) {
        results.add(result);
    }

    public List<DiceResult> findAll() {
        return new ArrayList<>(results);
    }

    public void clear() {
        results.clear();
    }
}
