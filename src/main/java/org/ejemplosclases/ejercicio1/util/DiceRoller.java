package org.ejemplosclases.ejercicio1.util;

import java.util.Random;

// Clase que simula el lanzamiento de un dado
public class DiceRoller {
    private static final Random random = new Random();

    public static int rollDice() {
        return random.nextInt(6) + 1; // tira un dado de 6 caras
    }
}
