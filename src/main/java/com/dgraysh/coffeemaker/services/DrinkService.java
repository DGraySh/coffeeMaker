package com.dgraysh.coffeemaker.services;

import com.dgraysh.coffeemaker.entity.BrewedDrink;
import com.dgraysh.coffeemaker.entity.Drink;
import com.dgraysh.coffeemaker.exceptions.DrinkNotFoundException;
import com.dgraysh.coffeemaker.repositories.BrewedDrinksRepository;
import com.dgraysh.coffeemaker.repositories.DrinkRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class DrinkService {

    private DrinkRepository drinkRepository;
    private BrewedDrinksRepository brewedDrinksRepository;

    public Drink findById(Long id) {
        return drinkRepository.findById(id).orElseThrow(() -> new DrinkNotFoundException("Unable to find drink with id: " + id));
    }

    public List<Drink> findAll() {
        return drinkRepository.findAll();
    }

    public BrewedDrink brewDrink(LocalDateTime time, Drink drink) {
        var brewedDrink = new BrewedDrink(time, drink);
        return brewedDrinksRepository.save(brewedDrink);
    }

    public List<BrewedDrink> findBrewedDrinks(Drink drink) {
        return brewedDrinksRepository.findAllByDrink(drink);
    }
}
