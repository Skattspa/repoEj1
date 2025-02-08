package org.ejemplosclases.ejercicio1.controller;

import org.ejemplosclases.ejercicio1.model.DiceResult;
import org.ejemplosclases.ejercicio1.service.DiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dice")
public class DiceController {

    private final DiceService diceService;

    public DiceController(DiceService diceService) {
        this.diceService = diceService;
    }

    /* @GetMapping("/roll/{diceCount}")
    public void rollDiceGet(@PathVariable int diceCount) {
        diceService.rollDice(diceCount);
    } */

    @PostMapping("/roll/{diceCount}")
    public void rollDice(@PathVariable int diceCount) {
        diceService.rollDice(diceCount);
    }

    @GetMapping("/results")
    public List<DiceResult> getResults() {
        return diceService.getResults();
    }

    @DeleteMapping("/reset")
    public void resetGame() {
        diceService.resetGame();
    }
}
