package org.ejemplosclases.ejercicio1.service;

import org.ejemplosclases.ejercicio1.model.DiceResult;

import java.util.List;

// Interfaz que define los metodos que se deben implementar para lanzar los dados
public interface DiceService {
    void rollDice(int diceCount);
    List<DiceResult> getResults();
    void resetGame();
}
