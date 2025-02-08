package org.ejemplosclases.ejercicio1.exception;

public class CustomGameException extends RuntimeException {
    // Se define una excepción personalizada para el juego
    public CustomGameException(String message) {
        super(message);
    }
}
