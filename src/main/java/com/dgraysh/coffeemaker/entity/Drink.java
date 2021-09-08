package com.dgraysh.coffeemaker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DRINKS")
public class Drink {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "VOLUME")
    private int volume;

    @Column(name = "COFFEE")
    private int coffee;

    @Column(name = "WATER")
    private int water;

    @Column(name = "MILK")
    private int milk;

}
