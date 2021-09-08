package com.dgraysh.coffeemaker.repositories;

import com.dgraysh.coffeemaker.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
    List<Drink> findAll();
    Optional<Drink> findById(Long id);

}
