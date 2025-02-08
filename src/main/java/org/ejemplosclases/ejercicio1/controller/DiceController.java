package org.ejemplosclases.ejercicio1.controller;

import org.ejemplosclases.ejercicio1.model.DiceResult;
import org.ejemplosclases.ejercicio1.service.DiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dice")
public class DiceController {
// Se inyecta el servicio de dados
    private final DiceService diceService;
// Se inyecta el servicio de dados
    public DiceController(DiceService diceService) {
        this.diceService = diceService;
    }

    /* Esta funcion da errores de implementación. se deja comentada para que no de errores en la compilación.
    @GetMapping("/roll/{diceCount}")
    public void rollDiceGet(@PathVariable int diceCount) {
        diceService.rollDice(diceCount);
    } */

    // Se define un endpoint POST que recibe un número de dados y llama al servicio para lanzarlos
    @PostMapping("/roll/{diceCount}")
    public void rollDice(@PathVariable int diceCount) {
        diceService.rollDice(diceCount);
    }

    // Se define un endpoint GET que devuelve la lista de resultados
    @GetMapping("/results")
    public List<DiceResult> getResults() {
        return diceService.getResults();
    }

    // Se define un endpoint DELETE que reinicia el juego
    @DeleteMapping("/reset")
    public void resetGame() {
        diceService.resetGame();
    }
}
