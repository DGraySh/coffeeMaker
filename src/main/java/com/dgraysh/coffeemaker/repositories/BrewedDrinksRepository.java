package com.dgraysh.coffeemaker.repositories;

import com.dgraysh.coffeemaker.entity.BrewedDrink;
import com.dgraysh.coffeemaker.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BrewedDrinksRepository extends JpaRepository<BrewedDrink, LocalDateTime> {
    List<BrewedDrink> findAllByDrink(Drink drink);
}
