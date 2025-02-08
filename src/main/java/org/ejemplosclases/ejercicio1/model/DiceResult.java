package org.ejemplosclases.ejercicio1.model;

import java.util.Map;

public class DiceResult {
    // Clase que representa el resultado de un lanzamiento de dados
    private int diceNumber;
    private int result;
    private Map<String, String> conditions; // Stores any special conditions affecting the roll

    public int getDiceNumber() {
        return diceNumber;
    }

    public void setDiceNumber(int diceNumber) {
        this.diceNumber = diceNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Map<String, String> getConditions() {
        return conditions;
    }

    public void setConditions(Map<String, String> conditions) {
        this.conditions = conditions;
    }
}
