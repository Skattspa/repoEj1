package org.ejemplosclases.ejercicio1.util;

import java.util.Random;

public class DiceRoller {
    private static final Random random = new Random();

    public static int rollDice() {
        return random.nextInt(6) + 1; // Rolls a standard 6-sided dice
    }
}
