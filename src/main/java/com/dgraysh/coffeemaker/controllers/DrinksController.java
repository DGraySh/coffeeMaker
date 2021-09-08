package com.dgraysh.coffeemaker.controllers;

import com.dgraysh.coffeemaker.entity.BrewedDrink;
import com.dgraysh.coffeemaker.entity.Drink;
import com.dgraysh.coffeemaker.services.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/coffeemaker/drinks")
@RequiredArgsConstructor
public class DrinksController {

    private final DrinkService drinkService;

    @GetMapping()
    public ResponseEntity<List<Drink>> getAllDrinks() {
        return new ResponseEntity<>(drinkService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Drink getDrinkById(@PathVariable Long id) {
        return drinkService.findById(id);
    }

    @PutMapping(value = "/brew/{id}", produces = "application/json")
    public BrewedDrink brew(@PathVariable Long id) {
        var drink = drinkService.findById(id);
        return drinkService.brewDrink(LocalDateTime.now(), drink);
    }

    @GetMapping(value = "/brewed/{id}", produces = "application/json")
    public List<BrewedDrink> getBrewedDrinks(@PathVariable Long id) {
        var drink = drinkService.findById(id);
        return drinkService.findBrewedDrinks(drink);
    }
}
