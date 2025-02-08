package org.ejemplosclases.ejercicio1.service;

import org.ejemplosclases.ejercicio1.model.DiceResult;

import java.util.List;

public interface DiceService {
    void rollDice(int diceCount);
    List<DiceResult> getResults();
    void resetGame();
}
