package org.ejemplosclases.ejercicio1.service.impl;

import org.ejemplosclases.ejercicio1.model.DiceResult;
import org.ejemplosclases.ejercicio1.repository.ResultRepository;
import org.ejemplosclases.ejercicio1.service.DiceService;
import org.ejemplosclases.ejercicio1.util.DiceRoller;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DiceServiceImpl implements DiceService {

    private final ResultRepository resultRepository;

    public DiceServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public void rollDice(int diceCount) {
        for (int i = 1; i <= diceCount; i++) {
            int result = DiceRoller.rollDice();
            Map<String, String> conditions = new HashMap<>();
            conditions.put("Condition", "None"); // Placeholder for actual conditions

            DiceResult diceResult = new DiceResult();
            diceResult.setDiceNumber(i);
            diceResult.setResult(result);
            diceResult.setConditions(conditions);

            resultRepository.save(diceResult);
        }
    }

    @Override
    public List<DiceResult> getResults() {
        return resultRepository.findAll();
    }

    @Override
    public void resetGame() {
        resultRepository.clear();
    }
}
